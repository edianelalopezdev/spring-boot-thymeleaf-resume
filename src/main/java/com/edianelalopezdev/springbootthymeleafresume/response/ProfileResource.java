package com.edianelalopezdev.springbootthymeleafresume.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class ProfileResource {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private String objective;
}
