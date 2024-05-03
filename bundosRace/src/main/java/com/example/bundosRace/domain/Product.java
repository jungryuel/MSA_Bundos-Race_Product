package com.example.bundosRace.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="PRODUCT_ID")
    private Long id;

    @Column(name ="PRODUCT_NAME")
    private String name;

    @Column(name ="IMAGE")
    private String image;

    @Column(name ="PRICE")
    private Integer price;

    @Column(name ="DISCOUNT_RATE")
    private Integer discountRate;

    @Column(name ="DELIVERY_PRICE")
    private Integer deliveryPrice;

    @ElementCollection //리스트를 받으려면 이렇게 받아야 함
    @Column(name ="OPTIONS")
    private List<String> options;

    @Column(name ="AMOUNT")
    private Integer amount;

    @CreatedDate
    @Column(name ="CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name ="STATUS")
    private Integer satus;

    @Column(name ="SELL_COUNT")
    private Integer sellCount;

    @ManyToOne
    @Column(name = "SELLER_ID")
    private Seller seller;

    @ManyToOne
    @Column(name = "CATEGORY_ID")
    private Category category;

}
