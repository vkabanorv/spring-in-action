package repository;

import domain.Order;
<<<<<<< Updated upstream

public interface OrderRepository {
    Order save(Order order);
=======
import domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
>>>>>>> Stashed changes
}
