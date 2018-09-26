package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable(value = "id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping("/{id}/edit")
  public String getEdit(Model model, @PathVariable(value = "id") long id) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String postEdit(@PathVariable(value = "id") long id,
                         @RequestParam(value = "title") String title,
                         @RequestParam(value = "urgent") Boolean urgent,
                         @RequestParam(value = "done") Boolean done) {
    Todo todoToBeEdited = todoRepository.findById(id).get();
    todoToBeEdited.setTitle(title);
    if (urgent != null) {
      todoToBeEdited.setUrgent(true);
    }
    if (done != null) {
      todoToBeEdited.setDone(true);
    }
    todoRepository.save(todoToBeEdited);
    return "redirect:/list";
  }
}
