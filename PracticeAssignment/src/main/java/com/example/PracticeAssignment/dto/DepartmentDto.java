package com.example.PracticeAssignment.dto;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class DepartmentDto {

    long departmentId;

    @NotBlank(message="Name is a required field")
    @Size(min = 10, max = 50, message = "Name must be between 10 to 50 character length")
    String deptName;

    @NotBlank(message="Description of birth is a required field")
    String description;

    @NotNull(message="Employee list is a required field")
    @Valid
    List<EmployeeDto> employeeDtoList;
}
