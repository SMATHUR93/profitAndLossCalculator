package com.example.profitAndLossCalculator.service;

import org.springframework.stereotype.Service;

@Service
public class ProfitAndLossService {

    public Double calculateProfitAndLoss(Double costPrice, Double sellingPrice) {
        if (sellingPrice > costPrice) {
            return sellingPrice - costPrice;
        } else if (costPrice > sellingPrice) {
            return costPrice - sellingPrice;
        } else {
            return 0.0;
        }
    }
}
