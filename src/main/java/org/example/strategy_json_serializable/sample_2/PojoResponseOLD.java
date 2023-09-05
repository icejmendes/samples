package org.example.strategy_json_serializable.sample_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoResponseOLD implements IStrategy {

    private String someDataX;

    private String someDataY;

    @Override
    public String execute() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
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
