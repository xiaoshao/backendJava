package com.xiaoshao.entity;

import java.io.Serializable;

public class ResponseEntity implements Serializable {

    private String first;
    private String second;

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }
}
