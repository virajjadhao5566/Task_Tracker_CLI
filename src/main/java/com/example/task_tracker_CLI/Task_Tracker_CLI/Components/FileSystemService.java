package com.example.task_tracker_CLI.Task_Tracker_CLI.Components;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FileSystemService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final File file = new File("tasks.json");



}
