package com.sonar.java.phoneshop_night.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
	private Integer Id;

    @Column(name = "brand_name")
	private String name;
}
