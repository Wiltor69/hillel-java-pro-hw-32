package ua.hillel.spring.boot;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Products")
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double cost;
    private String name;


}
