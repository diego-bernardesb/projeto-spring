package br.com.estoque.controller;

import br.com.estoque.model.Product;
import br.com.estoque.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> products(){
        return productRepository.findAll();
    }

}
