package ua.hillel.spring.boot;

import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceMemory implements OrderService{

    private List<Order> orders = new ArrayList<>() ;
    private static final Logger LOGGER = LogManager.getLogger(OrderServiceMemory.class);

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public Order getOrderById(int id) {
        LOGGER.info("Method getId");
        return orders.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public Order addOrder(Order order) {
        LOGGER.info("Method add");
        orders.add(order);
        LOGGER.debug("Order add {}", order);
        return order;
    }
}
