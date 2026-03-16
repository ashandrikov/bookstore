package com.bookstore.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController {

    private val log = LoggerFactory.getLogger(TestController::class.java)

    @PostMapping("/test")
    fun test(@RequestBody body: String): ResponseEntity<String> {
        log.info("Received request body: {}", body)
        return ResponseEntity.ok("Received: $body")
    }
}
