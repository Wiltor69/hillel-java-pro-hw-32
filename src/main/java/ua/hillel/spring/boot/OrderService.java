package ua.hillel.spring.boot;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(int id);
    Order addOrder(Order order);
}
