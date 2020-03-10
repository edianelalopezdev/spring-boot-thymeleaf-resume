package com.edianelalopezdev.springbootthymeleafresume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {

    private Long id;
    private String school;
    private String description;
    private String address;
}
