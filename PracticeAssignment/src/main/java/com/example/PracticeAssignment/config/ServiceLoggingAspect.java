package com.example.PracticeAssignment.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class ServiceLoggingAspect {
    private Logger LOGGER = LoggerFactory.getLogger(ServiceLoggingAspect.class);

    @Before("execution(* com.example.PracticeAssignment.service.DepartmentService.getDepartmentDto(..))")
    public void beforeDepartmentService(JoinPoint joinPoint) {
        LOGGER.info("Before called " + joinPoint.toString());
    }

    @After("execution(* com.example.PracticeAssignment.service.DepartmentService.getDepartmentDto(..))")
    public void afterDepartmentService(JoinPoint joinPoint) {
        LOGGER.info("After called " + joinPoint.toString());
    }

    @AfterThrowing("execution(* com.example.PracticeAssignment.service.EmployeeService.getEmployeeDto(..))")
    public void afterFailToCallEmployeeService(JoinPoint joinPoint) {
        LOGGER.info("After failed to call  " + joinPoint.toString());
    }
}
