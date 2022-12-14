package br.com.estoque.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String category;

    @Column(nullable = false)
    private Long quantity;

//    @Column(nullable = false)
//    private String price;
}
