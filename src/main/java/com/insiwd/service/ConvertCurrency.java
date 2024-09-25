package com.insiwd.service;

import com.insiwd.CurrencyDto.CurrencyDto;

import java.io.IOException;
import java.util.Scanner;

public class ConvertCurrency {
    CurrencyService currencyService;
    public ConvertCurrency() {
        this.currencyService = new CurrencyService();
    }

    public void convert(String from, String to) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja converter: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Insira um número válido: ");
            sc.next();
        }
        Double value = sc.nextDouble();

        try {
            CurrencyDto currencyDto = currencyService.getCurrency(from);
            Double conversionRate = currencyDto.getConversionRates().get(to);
            Double convertedValue = value * conversionRate;

            System.out.println("- - - - - -");
            System.out.printf("O Valor %.2f [%s] corresponde ao valor final de: %.2f [%s]%n", value, from,  convertedValue, to);
            System.out.println();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
