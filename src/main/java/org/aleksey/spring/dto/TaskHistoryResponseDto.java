package org.aleksey.spring.dto;

import java.time.LocalDateTime;

public class TaskHistoryResponseDto {
    private Long id;
    private Long taskId;
    private String oldState;
    private String newState;
    private LocalDateTime changeDate;
    private Long changeBy;
}
