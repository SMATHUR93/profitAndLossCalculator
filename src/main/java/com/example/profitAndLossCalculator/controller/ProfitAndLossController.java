package com.example.profitAndLossCalculator.controller;

import com.example.profitAndLossCalculator.service.ProfitAndLossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profit-and-loss")
public class ProfitAndLossController {

    @Autowired
    private ProfitAndLossService profitAndLossService;

    @GetMapping
    public Double calculateProfitAndLoss(@RequestParam Double costPrice, @RequestParam Double sellingPrice) {
        return profitAndLossService.calculateProfitAndLoss(costPrice, sellingPrice);
    }
}