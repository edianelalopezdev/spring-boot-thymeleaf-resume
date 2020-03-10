package com.edianelalopezdev.springbootthymeleafresume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private String objective;
}
