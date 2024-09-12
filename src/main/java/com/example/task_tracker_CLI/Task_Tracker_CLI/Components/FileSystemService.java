package com.example.task_tracker_CLI.Task_Tracker_CLI.Components;

import com.example.task_tracker_CLI.Task_Tracker_CLI.Models.Task;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSystemService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final File file = new File("tasks.json");

//    There would be read from read from file and write to the file
    public List<Task> readFile() throws IOException{
        if(!file.exists()){
            return new ArrayList<>();
        }
        return objectMapper.readValue(file, new TypeReference<List<Task>>() {});
    }

    public void writeFile(List<Task> tasks) throws IOException{
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(file,tasks);
    }

}
