package com.pe.relari.soap_ws_employee_v1.model.ws;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String firstName;
    private String fatherLastName;
    private String motherLastName;
    private String gender;
    private String birthdate;
    private String documentType;
    private String documentNumber;
    private ContactInfo contactInfo;
    private Company company;

}
