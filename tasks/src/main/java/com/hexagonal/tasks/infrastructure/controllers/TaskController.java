package com.hexagonal.tasks.infrastructure.controllers;

import com.hexagonal.tasks.application.services.TaskService;
import com.hexagonal.tasks.domain.model.AdditionalTaskInformation;
import com.hexagonal.tasks.domain.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task createdTask = taskService.createTask(task);
        return  new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long taskId){
        return taskService.getTask(taskId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTask(){
        List<Task> tasks = taskService.getAllTask();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<Task>updateTask(@PathVariable Long taskId, @RequestBody Task updateTask){
        return taskService.updateTask(taskId, updateTask)
                .map(task -> new ResponseEntity<>(updateTask, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable Long taskId){
        if(taskService.deleteTask(taskId)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{taskId}/aditionalInformation")
    public ResponseEntity<AdditionalTaskInformation> getAdditionalInformation(@PathVariable Long taskId){
        AdditionalTaskInformation additionalTaskInformation = taskService.getAdditionalTaskInformation(taskId);
        return new ResponseEntity<>(additionalTaskInformation, HttpStatus.OK);
    }
}
