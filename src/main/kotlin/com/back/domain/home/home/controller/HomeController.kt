package com.back.domain.home.home.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {
    @GetMapping("/")
    @ResponseBody
    fun main(): String {
        return "Hello!"
    }
}