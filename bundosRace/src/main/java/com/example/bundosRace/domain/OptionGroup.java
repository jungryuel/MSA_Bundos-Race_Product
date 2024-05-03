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
@Table(name = "OPTION_GROUP")
public class OptionGroup {
    @Id
    @GeneratedValue
    @Column(name = "OPTION_GROUP_ID")
    private Long id;

    @Column(name = "OPTION_NECESSARY")
    private Long necessary;

    @ManyToOne
    @Column(name = "PRODUCT_ID")
    private Product product;


}
