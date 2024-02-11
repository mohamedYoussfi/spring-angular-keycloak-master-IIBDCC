package net.youssfi.orderservice.model;
import lombok.*;
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
