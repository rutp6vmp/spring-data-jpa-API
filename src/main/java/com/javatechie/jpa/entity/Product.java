package com.javatechie.jpa.entity;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int pid;
    private String productName;
    private int qty;
    private int price;
}
