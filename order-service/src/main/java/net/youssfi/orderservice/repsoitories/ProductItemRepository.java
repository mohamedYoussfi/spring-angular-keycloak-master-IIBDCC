package net.youssfi.orderservice.repsoitories;

import net.youssfi.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
