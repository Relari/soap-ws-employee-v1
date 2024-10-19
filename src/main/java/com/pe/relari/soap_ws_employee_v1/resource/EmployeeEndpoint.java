package com.pe.relari.soap_ws_employee_v1.resource;


import com.github.relari.EmployeeRequest;
import com.github.relari.EmployeeResponse;
import com.pe.relari.soap_ws_employee_v1.service.EmployeeService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {
    private static final String NAMESPACE_URI = "http://github.com/Relari";

    private final EmployeeService employeeService;

    public EmployeeEndpoint(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "employeeRequest")
    @ResponsePayload
    public EmployeeResponse getCountry(@RequestPayload EmployeeRequest request) {

        return employeeService.createEmployeeApi(request);
    }
}
