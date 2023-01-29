package com.ws.work.java.test.java.domain;

import lombok.Data;

import com.ws.work.java.test.java.domain.Car;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "model")
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "model")
    private List<Car> cars = new ArrayList<>();

    private String name;
    private double fipeValue;
}
