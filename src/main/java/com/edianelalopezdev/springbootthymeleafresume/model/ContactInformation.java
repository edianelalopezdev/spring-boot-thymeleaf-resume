package com.edianelalopezdev.springbootthymeleafresume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactInformation {

    private Long id;
    private String phoneNumber;
    private String emailAddress;
    private String permanentAddress;
    private String currentAddress;
}
