package com.bookstore.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController {

    @PostMapping("/test")
    fun test(@RequestBody body: String): ResponseEntity<String> {
        println(body)
        return ResponseEntity.ok("Received: $body")
    }
}
