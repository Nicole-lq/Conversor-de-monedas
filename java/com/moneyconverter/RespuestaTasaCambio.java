package com.moneyconverter;

import java.util.Map;

public class RespuestaTasaCambio {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBase() {
        return base_code;
    }

    public Map<String, Double> getTasas() {
        return conversion_rates;
    }
}
