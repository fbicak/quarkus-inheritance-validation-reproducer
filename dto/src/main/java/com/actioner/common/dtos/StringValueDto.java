package com.actioner.common.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class StringValueDto extends ValueDto {

    public static final String TYPE = "string";

    @NotBlank(message = "value cannot be blank!")
    @JsonProperty("value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
