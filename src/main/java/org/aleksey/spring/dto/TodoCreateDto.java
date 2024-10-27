package org.aleksey.spring.dto;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.aleksey.spring.types.PriorityType;
import org.aleksey.spring.validation.EnumValidator;

import java.time.LocalDateTime;

public class TodoCreateDto {
    @Size(min = 1, max = 100)
    private String title;

    @Size(min = 1, max = 500)
    private String description;

    @NotBlank
    private LocalDateTime dueDate;

    @EnumValidator(enumClass = PriorityType.class, message = "Invalid Priority Status")
    private String priority;
}
