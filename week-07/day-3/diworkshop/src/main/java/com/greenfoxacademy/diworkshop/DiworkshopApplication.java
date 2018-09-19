package com.greenfoxacademy.diworkshop;

import com.greenfoxacademy.diworkshop.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiworkshopApplication implements CommandLineRunner {
  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(DiworkshopApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("SOME SPRING INFO");
    printer.log("hello");
    System.out.println("SOME SPRING INFO");
  }
}
