package com.bothty.restapihw1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String id;
    private String code;
    private String title;
    private Double price;
    private Boolean status;
}

