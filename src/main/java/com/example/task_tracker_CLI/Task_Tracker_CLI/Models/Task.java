package com.example.task_tracker_CLI.Task_Tracker_CLI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task{
    private Long id;
    private String description;
    private String status;
    private Date createdAt;
    private Date updatedAt;
}
