package com.emaginalabs.warrantyKeeperServer.server.resources

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController("/")
class GreetingResource {

    @RequestMapping("/")
    fun index(): String? {
        return "Greetings from Spring Boot!"
    }
}