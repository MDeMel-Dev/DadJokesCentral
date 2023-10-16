package com.nit3213.spring.dadjokescentral.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @RequestMapping("/")
    fun sayHello() = "Hello World"

    @RequestMapping("/jokes")
    fun sayAJoke() = "Hello, welcome to a world of jokes"

    @RequestMapping("/authors")
    fun returnAuthors() = "List of Authors"
}