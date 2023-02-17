package com.example.PracticeAssignment.controller;

import com.example.PracticeAssignment.dto.EmployeeDto;
import com.example.PracticeAssignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/employee")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        EmployeeDto employeeDto1 = employeeService.getEmployeeDto(employeeDto);
        return new ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }
}
