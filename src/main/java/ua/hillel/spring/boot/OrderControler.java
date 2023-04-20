package ua.hillel.spring.boot;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("http://localhost:8080")
@RequiredArgsConstructor
public class OrderControler {
    private final OrderService orderService;

    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Order> getOrderById(@PathVariable("id") int id) {
        Order order = orderService.getOrderById(id);

        return ResponseEntity.ok(order);
    }

    @PostMapping
    public @ResponseBody
    ResponseEntity<Order> addOrder(@RequestBody Order order) {
        Order created = orderService.addOrder(order);

        return ResponseEntity.ok(created);
    }

}
