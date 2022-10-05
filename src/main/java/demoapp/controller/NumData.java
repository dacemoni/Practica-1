package demoapp.controller;

import javax.validation.constraints.Positive;

public class NumData {
    @Positive
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}