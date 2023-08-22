package com.testauth.authentification.controllers;

import com.testauth.authentification.models.User;
import com.testauth.authentification.repositories.UserRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;
/**
 Accessibility course
 */
   @GetMapping("/")
    public String welcomeShield() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengersAssemble(){
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "";
    }
   /* @GetMapping("/user")
    public String getUser(Model model,
                          @RequestParam(required = false) Long id){

        User user = new User();
        if (id != null) {
            Optional<User> optionalUser = repository.findById(id);
            if (optionalUser.isPresent()) {
                user = optionalUser.get();
            }
        }
        model.addAttribute("user", user);

        return "user";
    }

    @GetMapping("/users")
    public String getAll(Model model){

        model.addAttribute("users", repository.findAll());

        return "users";
    }

    @PostMapping("/user")
    public String postUser(@ModelAttribute User user) {

        repository.save(user);
        return "redirect:/users";
    }

    @PutMapping("/user")
    public String putUser(@ModelAttribute User user) {

        repository.save(user);
        return  "redirect:/users";
    }

    @DeleteMapping("/user/delete")
    public  String deleteUser(@RequestParam Long id) {

        repository.deleteById(id);

        return "redirect:/users";
    }*/
}
