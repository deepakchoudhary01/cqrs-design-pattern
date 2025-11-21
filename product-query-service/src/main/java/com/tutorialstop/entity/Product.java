package com.tutorialstop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT_QUERY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_qr")
    @SequenceGenerator(
            name = "product_qr",
            sequenceName = "PRODUCT_QR",  // Oracle sequence name
            allocationSize = 1             // Important for Oracle (avoid gaps)
    )
    private Long id;

    private String name;
    private String description;
    private double price;
}
