package net.youssfi.orderservice.repsoitories;


import net.youssfi.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
