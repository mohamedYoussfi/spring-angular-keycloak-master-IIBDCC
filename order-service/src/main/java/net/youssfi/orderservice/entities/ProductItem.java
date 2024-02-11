package net.youssfi.orderservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import net.youssfi.orderservice.model.Product;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    private double price;
    private int quantity;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;
    @Transient
    private Product product;
}
