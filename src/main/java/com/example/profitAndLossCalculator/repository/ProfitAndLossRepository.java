package com.example.profitAndLossCalculator.repository;

import com.example.profitAndLossCalculator.entity.ProfitAndLoss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfitAndLossRepository extends JpaRepository<ProfitAndLoss, Long> {

}
