package org.example.strategy_json_serializable.sample_2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoResponseNEW implements IStrategy{

    private String transactionCode;
    @JsonIgnore
    private String someDataX;
    @JsonIgnore
    private String someDataY;

    @Override
    public String execute()  {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getSomeDataX() {
        return someDataX;
    }

    public void setSomeDataX(String someDataX) {
        this.someDataX = someDataX;
    }

    public String getSomeDataY() {
        return someDataY;
    }

    public void setSomeDataY(String someDataY) {
        this.someDataY = someDataY;
    }
}
