package com.example.springkotlintemplate

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/api")
class HelloController {

    @GetMapping("/hello")
    fun hello() = "Hello"

    @GetMapping("/stat")
    fun getStat() = (1..5)
        .map { Random.nextInt() }
        .toList()

}
