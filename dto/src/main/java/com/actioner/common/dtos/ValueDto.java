package com.actioner.common.dtos;

import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotBlank;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = StringValueDto.class, name = StringValueDto.TYPE),
        @JsonSubTypes.Type(value = BooleanValueDto.class, name = BooleanValueDto.TYPE)
})
public abstract class ValueDto {

    @JsonProperty("log")
    @NotBlank(message = "log cannot be empty")
    private String log;

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
