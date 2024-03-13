package com.actioner.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {

    @JsonProperty("result")
    private String result;

    public String getResult() {
        return result;
    }

    public ResponseDto setResult(String result) {
        this.result = result;
        return this;
    }
}
