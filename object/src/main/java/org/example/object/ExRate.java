package org.example.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExRate {
    private String result;
    private Map<String, BigDecimal> rates;

    public ExRate() {
    }

    public String getResult() {
        return result;
    }

    public Map<String, BigDecimal> getRates() {
        return rates;
    }
}
