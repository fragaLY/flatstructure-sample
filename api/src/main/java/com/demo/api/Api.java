package com.demo.api;

import com.demo.dto.DomainDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/** @author Vadzim_Kavalkou */
@Tag(name = "#domain-service", description = "Domain Service")
@RequestMapping("/api/v1/domain")
@Validated
public interface Api {

    @Operation(
            tags = {"#domain-service"},
            description = "Retrieves all domain data")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Data result",
                            content = @Content(schema = @Schema(implementation = DomainDto.class))),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Data was not found",
                            content = @Content(schema = @Schema(implementation = IllegalArgumentException.class))), // todo : replace with custom error
                    @ApiResponse(
                            responseCode = "500",
                            description = "General application error",
                            content = @Content(schema = @Schema(implementation = IllegalArgumentException.class))) // todo : replace with custom error
            })
    @GetMapping(value = "/domains", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<DomainDto>> domains();

    @Operation(
            tags = {"#domain-service"},
            description = "Retrieves domain data by id")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Data result",
                            content = @Content(schema = @Schema(implementation = DomainDto.class))),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Data was not found",
                            content = @Content(schema = @Schema(implementation = IllegalArgumentException.class))), // todo : replace with custom error
                    @ApiResponse(
                            responseCode = "500",
                            description = "General application error",
                            content = @Content(schema = @Schema(implementation = IllegalArgumentException.class))) // todo : replace with custom error
            })
    @GetMapping(value = "/domains/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<DomainDto> domain(@NotNull @PathVariable Long id);
}
