package com.example.profitAndLossCalculator.controller;

import com.example.profitAndLossCalculator.service.ProfitAndLossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profit-and-loss")
public class ProfitAndLossController {

    @Autowired
    private ProfitAndLossService profitAndLossService;

    @PostMapping
    public Double calculateProfitAndLoss(@RequestParam Double costPrice, @RequestParam Double sellingPrice) {
        return profitAndLossService.calculateProfitAndLoss(costPrice, sellingPrice);
    }
}