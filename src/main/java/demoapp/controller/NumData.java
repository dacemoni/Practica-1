package demoapp.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class NumData {
    @NotNull
    @Positive
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}