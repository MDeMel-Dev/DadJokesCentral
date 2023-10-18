package com.nit3213.spring.dadjokescentral.controllers

import com.nit3213.spring.dadjokescentral.JokesList
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainController {

    @RequestMapping("") //localhost:8080/api
    fun sayHello() = "Hello World, Here's my documentaion."

    @RequestMapping("/creators") //localhost:8080/api/creators
    fun returnProjectCreators() = "Name 1, Name 2"

    @RequestMapping("/jokes", method = arrayOf(RequestMethod.GET)) //localhost:8080/api/jokes
    fun returnJokes() = JokesList(jokes = listOf("Why don't scientists trust atoms? Because they make up everything!\n",
        "What did one plate say to another plate? \"Tonight, dinner's on me!\"\n",
        "Why did the scarecrow win an award? Because he was outstanding in his field!\n",
        "How does a penguin build its house? Igloos it together!\n",
        "Did you hear about the mathematician who’s afraid of negative numbers? He will stop at nothing to avoid them!"))
}