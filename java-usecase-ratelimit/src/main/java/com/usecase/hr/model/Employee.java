package com.usecase.hr.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@JsonSerialize
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
}
