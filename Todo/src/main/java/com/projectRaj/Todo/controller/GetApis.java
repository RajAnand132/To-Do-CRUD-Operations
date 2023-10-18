package com.projectRaj.Todo.controller;

import com.projectRaj.Todo.models.Status;
import com.projectRaj.Todo.models.Todo;
import com.projectRaj.Todo.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetApis {
    @Autowired
    CRUDService services;

    @GetMapping("api/todo/userTasks")
    public List<Todo> getList(){
        return services.getAll();
    }

    @GetMapping("api/todo/status/{id}")
    public String getStatus(@PathVariable Integer id) {
        return services.getStatus(id).toString();
    }

    @GetMapping("todo/title/{title}")
    public List<Todo> findByTitle(@PathVariable String title){
        return services.getByTitle(title);
    }

    @GetMapping("api/todo/status")
    public List<Todo> findAllTaskBasedOnSecltedStatus(@RequestParam Status status){
        return services.findAllTaskBasedOnSecltedStatus(status);
    }
}
