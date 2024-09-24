package com.insiwd.CurrencyDto;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CurrencyDto {
    @SerializedName("base_code")
    private String base_code;
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates; // Armazena todas as taxas de câmbio

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    @Override
    public String toString() {
        return "CurrencyDto{" +
                "base_code='" + base_code + '\'' +
                ", conversionRates=" + conversionRates +
                '}';
    }
}
