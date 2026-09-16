package com.example.lab10.controller;

import com.example.lab10.client.ProductWebClient;
import com.example.lab10.model.Product;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test-client")
public class TestClientController {

    private final ProductWebClient webClient;

    public TestClientController(ProductWebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/all")
    public Flux<Product> testGetAll() {
        return webClient.getAllProducts();
    }

    @GetMapping("/{id}")
    public Mono<Product> testGetById(@PathVariable String id) {
        return webClient.getProductById(id);
    }

    @GetMapping("/price/{id}")
    public Mono<Double> testPrice(@PathVariable String id) {
        return webClient.getDiscountedPrice(id);
    }

    @PostMapping("/create")
    public Mono<Product> testCreate(@RequestBody Product p) {
        return webClient.createProduct(p);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> testDelete(@PathVariable String id) {
        return webClient.deleteProduct(id);
    }
}