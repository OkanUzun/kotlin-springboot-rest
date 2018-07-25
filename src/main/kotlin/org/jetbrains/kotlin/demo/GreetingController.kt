package org.jetbrains.kotlin.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "firstName") firstName: String, @RequestParam(value = "lastName") lastName: String) =
            Greeting(counter.incrementAndGet(), "Hello $firstName $lastName")
}