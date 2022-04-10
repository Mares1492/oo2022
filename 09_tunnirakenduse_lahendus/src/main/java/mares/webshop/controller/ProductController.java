package mares.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import mares.webshop.model.Product;
import mares.webshop.repository.ProductRepository;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products") //localhost:8080/products   GET
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    @GetMapping("products/{index}")  //localhost:8080/products/1   GET
    public Product getProduct(@PathVariable Long index) {
        return productRepository.findById(index).get();
    }
    @DeleteMapping("products/{index}") //localhost:8080/products/1  DELETE
    public void deleteProduct(@PathVariable Long index) {
        productRepository.deleteById(index);
    }
    @DeleteMapping("products") //localhost:8080/products   DELETE
    public String deleteAllProducts() {
        productRepository.deleteAll();
        return "Kõik toodet kustutatud";
    }
    @PostMapping("products") //localhost:8080/products  POST
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
    @PutMapping("products/{index}") //localhost:8080/products/1
    public void editProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
