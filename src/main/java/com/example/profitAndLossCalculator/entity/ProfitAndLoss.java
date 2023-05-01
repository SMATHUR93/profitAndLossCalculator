package com.example.profitAndLossCalculator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profit_and_loss")
public class ProfitAndLoss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double costPrice;

    private Double sellingPrice;

    private Double profitOrLoss;

    // Getters and Setters
}
