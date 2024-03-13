package com.actioner.common.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class BooleanValueDto extends ValueDto {

    public static final String TYPE = "boolean";

    @NotNull(message = "value cannot be null!")
    @JsonProperty("value")
    private Boolean value;
}
