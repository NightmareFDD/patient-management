package com.pm.patientservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatientResponseDTO {

    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;

}
