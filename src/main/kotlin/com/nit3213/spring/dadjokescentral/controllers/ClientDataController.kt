package com.nit3213.spring.dadjokescentral.controllers

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ClientDataController {

    @RequestMapping("/simple/{number}", method = arrayOf(RequestMethod.GET)) // {nameOfValueHere} should be same as value -> @PathVariable(required = false) nameOfValueHere: Int
    fun showTheParam(@PathVariable(required = false) number: Int): String {

        return "The number you shared is $number"
    }

    @RequestMapping("/query", method = arrayOf(RequestMethod.GET)) //localhost:8080/api/query?author=Jacob
    fun respondWithQuery(@RequestParam(required = false, defaultValue = "") author: String): String {
        return "Author's name is $author"
    }

    @RequestMapping("/doublequery", method = arrayOf(RequestMethod.GET, RequestMethod.POST)) //localhost:8080/api/doublequery?author=DavidFinch&location=Ireland
    fun respondWithDoubleQuery(@RequestParam(required = false, defaultValue = "") author: String, location: String): String {
        return "Author's name is $author and location is $location"
    }
}