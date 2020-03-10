package com.edianelalopezdev.springbootthymeleafresume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {

    private Long id;
    private String project;
    private String role;
    private String company;
}
