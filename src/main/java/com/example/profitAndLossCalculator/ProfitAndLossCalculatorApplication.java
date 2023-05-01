package com.example.profitAndLossCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProfitAndLossCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfitAndLossCalculatorApplication.class, args);
	}

}
