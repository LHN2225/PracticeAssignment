package com.example.PracticeAssignment.service.Impl;

import com.example.PracticeAssignment.dto.DepartmentDto;
import com.example.PracticeAssignment.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        LOGGER.info(departmentDto.toString());
        return departmentDto;
    }
}
