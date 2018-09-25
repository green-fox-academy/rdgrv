package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = "/list")
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive,
                     Model model) {

    if (isActive == null) {
      model.addAttribute("todolist", todoRepository.findAll());
      return "todolist";
    }

    model.addAttribute("todolist", todoRepository.findByDone(true));
    return "todolist";
  }

  @GetMapping("/add")
  public String getAdd() {
    return "add";
  }

  @PostMapping("/add")
  public String postAdd(@RequestParam(value = "title") String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/list";
  }
}
