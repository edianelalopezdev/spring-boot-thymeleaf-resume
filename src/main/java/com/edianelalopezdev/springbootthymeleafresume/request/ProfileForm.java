package com.edianelalopezdev.springbootthymeleafresume.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
public class ProfileForm {

    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private String objective;
}
