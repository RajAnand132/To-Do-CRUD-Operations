package com.projectRaj.Todo.service;

import com.projectRaj.Todo.models.Status;
import com.projectRaj.Todo.models.Todo;
import com.projectRaj.Todo.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CRUDService {
    @Autowired
    TodoRepository todoRepository;

    public boolean addRecord(Todo task){
        todoRepository.save(task);
        return true;
    }
    public boolean addRecords(List<Todo> todos){
        todoRepository.saveAll(todos);
        return true;
    }

    public boolean updateStatus(Integer id, Status status){
        if(!todoRepository.existsById(id))return false;
        Optional<Todo> temp=todoRepository.findById(id);
        Todo temp2=temp.get();
        temp2.setStatus(status);
        todoRepository.save(temp2);
        return true;

    }
    public List<Todo> getAll(){
        return (List<Todo>) todoRepository.findAll();
    }
    public Status getStatus(Integer id){
        return todoRepository.findById(id).get().getStatus();
    }

    public boolean deleteRecord(Integer id){
        if(!todoRepository.existsById(id))return false;
        todoRepository.deleteById(id);
        return true;
    }
    public void deletAll(){
        todoRepository.deleteAll();
    }

    public boolean deleteList(List<Integer> todoTiltels){
        todoRepository.deleteAllById(todoTiltels);
        return true;
    }
    public List<Todo> getByTitle(String title){
        return todoRepository.findByTitle(title);
    }

    public List<Todo> findAllTaskBasedOnSecltedStatus(Status status){
        return todoRepository.findByStatus(status);
    }
}
