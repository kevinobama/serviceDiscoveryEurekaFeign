package com.devglan.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
public class HomeController {
    @GetMapping("index")
    public String index() {
        return "Feign is a declarative web service client. It makes writing web service clients easier. To use Feign create an interface and annotate it. It has pluggable annotation support including Feign annotations and JAX-RS annotations. Feign also supports pluggable encoders and decoders. Spring Cloud adds support for Spring MVC annotations and for using the same HttpMessageConverters used by default in Spring Web. Spring Cloud integrates Ribbon and Eureka to provide a load balanced http client when using Feign.";
    }
}