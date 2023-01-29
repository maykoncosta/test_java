package com.ws.work.java.test.java.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@JsonPropertyOrder(alphabetic = false)
public class ListAllCarsDTO {
    @ApiModelProperty(notes = "Car ID", example = "1", required = true)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("brand_id")
    private Long brandId;

    @JsonProperty("brand_name")
    private String brandName;

    @JsonProperty("model_name")
    private String modelName;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("fuel")
    private String fuel;

    @JsonProperty("number_doors")
    private Integer numberDoors;

    @JsonProperty("fipe_value")
    private Double fipeValue;

    @JsonProperty("color")
    private String color;

    @JsonProperty("timestamp_registry")
    private LocalDateTime timestampRegistry;
}
