package com.actioner.web;

import com.actioner.web.dto.ResponseDto;
import com.actioner.web.payload.UpdateEntityPayload;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/entities")
public class ValidationReproducerController {

    @Path("/{id}")
    @PUT
    public ResponseDto updateEntity(@PathParam("id") String id, @NotNull @Valid UpdateEntityPayload payload) throws JsonProcessingException {
        return new ResponseDto().setResult("Entity updated. Payload: " + new ObjectMapper().writeValueAsString(payload));
    }
}
