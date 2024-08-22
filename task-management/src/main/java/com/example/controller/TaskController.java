package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class TaskController {

    public TaskController() {
        System.out.println("TaskController initialized");
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return "tasks"; // Sample data
    }
}
