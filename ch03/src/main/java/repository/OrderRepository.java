package repository;

import domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
