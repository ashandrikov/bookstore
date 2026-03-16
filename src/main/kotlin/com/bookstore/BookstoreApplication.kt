package com.bookstore

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookstoreApplication

private val log = LoggerFactory.getLogger(BookstoreApplication::class.java)

fun main(args: Array<String>) {
    runApplication<BookstoreApplication>(*args)
    log.info("Bookstore application started successfully")
}
