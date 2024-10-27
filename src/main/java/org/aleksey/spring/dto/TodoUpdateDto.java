package org.aleksey.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.aleksey.spring.types.PriorityType;
import org.aleksey.spring.types.StatusType;
import org.aleksey.spring.validation.EnumValidator;

import java.time.LocalDateTime;

public class TodoUpdateDto {
    @Size(min = 1, max = 100)
    private String title;

    @Size(min = 1, max = 500)
    private String description;

    @NotBlank
    private LocalDateTime dueDate;

    @EnumValidator(enumClass = PriorityType.class, message = "Invalid Type Priority")
    private String priority;

    @EnumValidator(enumClass = StatusType.class, message = "Invalid Type Status")
    private String status;

}
