package org.aleksey.spring.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.aleksey.spring.dto.TodoCreateDto;
import org.aleksey.spring.dto.TodoResponseDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "todos")
public class TodosController {

}
