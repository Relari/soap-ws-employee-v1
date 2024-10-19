package com.pe.relari.soap_ws_employee_v1.dao.ws;

import com.github.relari.EmployeeRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "${application.http-client.employee-api.name}",
        url = "${application.http-client.employee-api.url}"
)
public interface EmployeeApi {

    @PostMapping(path = "/srv/neg/v1/employee-configuration")
    ResponseEntity<Void> createEmployee(
            @RequestBody EmployeeRequest request
    );

}
