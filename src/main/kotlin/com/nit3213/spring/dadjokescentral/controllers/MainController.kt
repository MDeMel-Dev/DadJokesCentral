package com.nit3213.spring.dadjokescentral.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainController {

    @RequestMapping("") //localhost:8080/api
    fun sayHello() = "Hello World, Here's my documentaion."

    @RequestMapping("/creators") //localhost:8080/api/creators
    fun returnProjectCreators() = "Name 1, Name 2"
}