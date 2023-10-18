package com.projectRaj.Todo.repo;

import com.projectRaj.Todo.models.Status;
import com.projectRaj.Todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Integer> {
    List<Todo> findByTitle(String title);

    List<Todo> findByStatus(Status status);
}
