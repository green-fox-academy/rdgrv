package com.greenfoxacademy.diworkshop.controller;

import com.greenfoxacademy.diworkshop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GFAController {

  @Autowired
  StudentService studentService;

  @RequestMapping("/gfa")
  public String mainPage() {
    return "gfa";
  }

  @RequestMapping("/gfa/list")
  public String gfaList(Model model) {
    model.addAttribute("studentlist", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String addStudent() {
    return "add";
  }

  @GetMapping("/gfa/save")
  public String saveStudent(@RequestParam(value = "studentname") String name) {
    studentService.save(name);
    return "redirect:list";
  }
}