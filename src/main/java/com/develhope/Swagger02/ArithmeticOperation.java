package com.develhope.Swagger02;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class ArithmeticOperation {

    String name;
    Integer minNumberOfOperands;
    String description;
    String[] properties;

    public ArithmeticOperation(String name, Integer minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

}
