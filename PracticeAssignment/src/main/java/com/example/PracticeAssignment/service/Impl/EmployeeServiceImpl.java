package com.example.PracticeAssignment.service.Impl;

import com.example.PracticeAssignment.dto.EmployeeDto;
import com.example.PracticeAssignment.service.DepartmentService;
import com.example.PracticeAssignment.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
        LOGGER.info(employeeDto.toString());
        return employeeDto;
    }
}
