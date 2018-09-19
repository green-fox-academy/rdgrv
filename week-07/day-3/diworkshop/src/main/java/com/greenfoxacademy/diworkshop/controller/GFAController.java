package com.greenfoxacademy.diworkshop.controller;

import com.greenfoxacademy.diworkshop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
