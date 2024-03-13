package com.actioner.web.payload;

import com.actioner.common.dtos.ValueDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UpdateEntityPayload {

    @JsonProperty("name")
    @NotBlank(message = "name cannot be empty")
    @Size(max = 24, message = "name cannot be longer than {max} characters")
    private String name;

    @JsonProperty("field")
    @NotNull(message = "field cannot be null")
    @Valid
    private ValueDto field;
}
