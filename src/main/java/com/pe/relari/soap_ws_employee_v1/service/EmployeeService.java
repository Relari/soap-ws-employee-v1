package com.pe.relari.soap_ws_employee_v1.service;

import com.github.relari.EmployeeRequest;
import com.github.relari.EmployeeResponse;
import com.pe.relari.soap_ws_employee_v1.dao.ws.EmployeeApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {

    EmployeeApi employeeApi;

    public EmployeeResponse createEmployeeApi(EmployeeRequest request) {
//        var response = employeeApi.createEmployee(request);
//
//        if (response.getStatusCode().is1xxInformational()) {
//            System.out.println("Empleado creado.");
//        }

        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setFirstName(request.getFirstName());
        employeeResponse.setFatherLastName(request.getFatherLastName());
        employeeResponse.setMotherLastName(request.getMotherLastName());

        return employeeResponse;
    }

}