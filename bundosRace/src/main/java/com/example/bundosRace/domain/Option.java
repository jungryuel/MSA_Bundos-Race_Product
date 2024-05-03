package com.example.bundosRace.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Table(name = "OPTION")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OPTION_ID")
    private Long id;

    @Column(name = "OPTION_NAME")
    private String name;

    @Column(name = "OPTION_PRICE")
    private Integer price;

    @Column(name = "OPTION_SOLDOUT")
    private Long soldOut;

    @Column(name = "AMOUNT")
    private Long amount;


}
