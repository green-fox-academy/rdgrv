package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Trick;
import com.greenfoxacademy.foxclub.service.DrinkService;
import com.greenfoxacademy.foxclub.service.FoodService;
import com.greenfoxacademy.foxclub.service.FoxService;
import com.greenfoxacademy.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @Autowired
  TrickService trickService;

  @Autowired
  DrinkService drinkService;

  @Autowired
  FoodService foodService;

  @RequestMapping("/")
  public String mainPage(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "food", required = false) String food,
                         @RequestParam(value = "drink", required = false) String drink,
                         @RequestParam(value = "trick", required = false) String trick,
                         Model model) {
    if (name == null || name.isEmpty()) {
      return "redirect:/login";
    }

    if (food == null && drink == null && trick == null) {
      Fox fox = foxService.getFoxByName(name);
      model.addAttribute("fox", fox);
      return "information";
    }

    Fox fox = new Fox();
    fox.setName(name);
    fox.setFood(food);
    fox.setDrink(drink);
    fox.getKnownTricks().add(trickService.getTrickByName(trick));
    foxService.addFox(fox);
    model.addAttribute("fox", fox);
    return "information";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam(value = "name") String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping("/create")
  public String getCreate(Model model) {
    model.addAttribute("foods", foodService.getFoodRepository().getFoodList());
    model.addAttribute("drinks", drinkService.getDrinkRepository().getDrinkList());
    model.addAttribute("tricks", trickService.getTrickRepository().getTrickList());
    return "create";
  }

  @PostMapping("/create")
  public String postCreate(@RequestParam(value = "name") String name,
                           @RequestParam(value = "food") String food,
                           @RequestParam(value = "drink") String drink,
                           @RequestParam(value = "trick") String trick) {
    return "redirect:/?name=" + name + "&food=" + food + "&drink=" + drink + "&trick=" + trick;
  }

  @GetMapping("/addcustomvalues")
  public String getCustomValues() {
    return "addcustomvalues";
  }

  @PostMapping("/addcustomvalues")
  public String postCustomValues(@RequestParam(value = "food") String food,
                                 @RequestParam(value = "drink") String drink,
                                 @RequestParam(value = "trick") String trick) {

    foodService.getFoodRepository().getFoodList().add(new Food(food));
    drinkService.getDrinkRepository().getDrinkList().add(new Drink(drink));
    trickService.getTrickRepository().getTrickList().add(new Trick(trick));

    return "redirect:/create";
  }

  @GetMapping("/nutritionstore")
  public String getNutritionStore(@RequestParam(value = "name") String name,
                                  Model model) {
    model.addAttribute("foods", foodService.getFoodRepository().getFoodList());
    model.addAttribute("drinks", drinkService.getDrinkRepository().getDrinkList());
    model.addAttribute("fox", foxService.getFoxByName(name));
    return "nutritionstore";
  }

  @PostMapping("/nutritionstore")
  public String postNutritionStore(@RequestParam(value = "name") String name,
                                   @RequestParam(value = "food") String food,
                                   @RequestParam(value = "drink") String drink) {
    foxService.getFoxByName(name).setFood(food);
    foxService.getFoxByName(name).setDrink(drink);
    return "redirect:/?name=" + name;
  }
}