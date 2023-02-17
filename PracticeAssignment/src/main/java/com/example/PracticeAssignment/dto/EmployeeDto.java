package com.example.PracticeAssignment.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class EmployeeDto {

    long employeeId;
    @NotBlank(message="Name is a required field")
    @Size(min = 10, max = 50, message = "Name must be between 10 to 50 character length")
    String name;
    @NotNull(message="Date of birth is a required field")
    Date birthDate;
    Boolean gender;
    @NotBlank(message="Email is a required field")
    @Email
    String email;
}
