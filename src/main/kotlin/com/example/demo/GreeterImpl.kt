package com.example.demo

import com.example.demo.com.example.demo.Greeter
import org.springframework.stereotype.Component

@Component
class GreeterImpl : Greeter {
    override fun sayHello(name: String) = "Hello $name"
}