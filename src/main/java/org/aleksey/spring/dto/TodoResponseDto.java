package org.aleksey.spring.dto;

import java.time.LocalDateTime;

public class TodoResponseDto {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private String priority;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
