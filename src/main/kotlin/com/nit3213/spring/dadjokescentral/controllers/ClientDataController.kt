package com.nit3213.spring.dadjokescentral.controllers

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ClientDataController {

    @RequestMapping("/simple/{number}") // {nameOfValueHere} should be same as value -> @PathVariable(required = false) nameOfValueHere: Int
    fun showTheParam(@PathVariable(required = false) number: Int): String {

        return "The number you shared is $number"
    }
}