package com.edianelalopezdev.springbootthymeleafresume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnicalSkill {

    private Long id;
    private String skill;
    private String group;
}
