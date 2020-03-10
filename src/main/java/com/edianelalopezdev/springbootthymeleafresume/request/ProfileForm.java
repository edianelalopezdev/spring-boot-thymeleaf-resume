package com.edianelalopezdev.springbootthymeleafresume.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
public class ProfileForm {

    @NotEmpty(message = "first name required")
    @Length(max = 256, message = "first name too long")
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private String objective;
}
