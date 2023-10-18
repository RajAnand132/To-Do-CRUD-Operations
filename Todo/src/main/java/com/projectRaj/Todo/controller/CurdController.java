package com.projectRaj.Todo.controller;

import com.projectRaj.Todo.models.Status;
import com.projectRaj.Todo.models.Todo;
import com.projectRaj.Todo.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurdController {

    @Autowired
    CRUDService crudService;

    @PostMapping("/api/task")
    public String addTask(@RequestBody Todo task) {
        if (crudService.addRecord(task)) {
            return "Task added successfully.";
        }
        return "Failed to add task. Please check your request.";
    }

    @PostMapping("/api/tasks")
    public String addTasks(@RequestBody List<Todo> todos) {
        if (crudService.addRecords(todos)) {
            return "Tasks added successfully.";
        }
        return "Failed to add tasks. Please check your request.";
    }

    @PutMapping("/api/status")
    public String updateStatus(@RequestParam Integer id, @RequestParam Status status) {
        if (crudService.updateStatus(id, status)) {
            return "Task status updated successfully.";
        }
        return "Failed to update task status. Please check your request.";
    }

    @DeleteMapping("/api/task/id")
    public String deleteRecord(@RequestParam Integer id) {
        if (crudService.deleteRecord(id)) {
            return "Task deleted successfully.";
        }
        return "Failed to delete task. Please check your request.";
    }

    @DeleteMapping("/api/tasks/ids")
    public String deleteRecords(@RequestParam List<Integer> ids) {
        if (crudService.deleteList(ids)) {
            return "Tasks deleted successfully.";
        }
        return "Failed to delete tasks. Please check your request.";
    }
}

