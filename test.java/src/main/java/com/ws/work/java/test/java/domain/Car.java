package com.ws.work.java.test.java.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table(name = "car")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Car ID", example = "1", required = true)
    @JsonProperty("id_car")
    private Long id;

    private Timestamp timestampRegistry;

    @ManyToOne
    private Model model;

    private String fuel;

    private int numberDoors;

    @Column(name = "color_car")
    private String color;

    @Column(name = "year_car")
    private int year;

}
