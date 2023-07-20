package com.cursojava.curso.controllers;

import com.cursojava.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
    public User getUserForId(@PathVariable Long id){

        User user = new User();
        user.setId(id);
        user.setFirstName("Juan Pablo");
        user.setLastName("Leon Fonseca");
        user.setEmail("papo@gmail.com");
        user.setCellPhone("123456789");
        user.setPassword("123");
        return user;
    }

    @RequestMapping(value = "users")
    public User getUser(){

        User user = new User();
        user.setFirstName("Juan Pablo");
        user.setLastName("Leon Fonseca");
        user.setEmail("papo@gmail.com");
        user.setCellPhone("123456789");
        user.setPassword("123");
        return user;
    }
}
