package com.greenfoxacademy.todolist.repository;

import com.greenfoxacademy.todolist.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
