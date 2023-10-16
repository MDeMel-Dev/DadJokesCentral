package com.nit3213.spring.dadjokescentral.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainController {

    @RequestMapping("")
    fun sayHello() = "Hello World, Here's my documentaion."

    @RequestMapping("/creators")
    fun returnProjectCreators() = "Name 1, Name 2"
}