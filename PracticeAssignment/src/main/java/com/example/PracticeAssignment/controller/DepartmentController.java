package com.example.PracticeAssignment.controller;

import com.example.PracticeAssignment.dto.DepartmentDto;
import com.example.PracticeAssignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/department")
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody @Valid DepartmentDto departmentDto) {
        DepartmentDto departmentDto1 = departmentService.getDepartmentDto(departmentDto);
        return new ResponseEntity<>(departmentDto1, HttpStatus.CREATED);
    }
}
