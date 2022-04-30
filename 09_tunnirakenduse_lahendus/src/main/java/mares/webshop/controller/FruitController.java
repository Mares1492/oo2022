package mares.webshop.controller;

import mares.webshop.model.Product;
import mares.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FruitController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("fruits") // localhost:8080/products   GET
    public List<Product> getFruit() {
        return productRepository.findAll();
    }

    @GetMapping("fruits/{index}") // localhost:8080/products/1  GET
    public Product getFruit(@PathVariable Long index) {
        return productRepository.findById(index).get();
    }

    @DeleteMapping("fruits/{index}") // localhost:8080/products/1 DELETE
    public void deleteFruit(@PathVariable Long index) {
        productRepository.deleteById(index);
    }

    @DeleteMapping("fruits")  // localhost:8080/products   DELETE
    public String deleteAllFruit() {
        productRepository.deleteAll();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("fruits") // localhost:8080/products  POST
    public void addFruit(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("fruits") // localhost:8080/products  PUT
    public void editFruit(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PostMapping("add-all-fruits") // localhost:8080/products  POST
    public void addFruit(@RequestBody List<Product> products) {
        productRepository.saveAll(products);
    }
}

