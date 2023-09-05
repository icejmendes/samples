package org.example.strategy_json_serializable.sample_1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;

public class PojoDTO {

    //GSON
    @Expose
    private String transactionCode;

    //JACKSON
    @JsonIgnore
    private String someDataX;
    @JsonIgnore
    private String someDataY;


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
