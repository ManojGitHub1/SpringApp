package com.manoj.myWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.myWebApp.model.Product;
import com.manoj.myWebApp.services.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


// Controller's Job is to ascept the request
// and ask Service to do that

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    // Instead of using @RequestMapping("/products") we can use below as 2 methods can have same url but different Mapping
    // By default every Request is Get request
    @GetMapping("/products")    
    public List<Product> getProducts(){
        return service.getProducts();
    }

    // as we are matching the {prodId} we have to use @PathVariable
    @GetMapping("/products/{prodId}")
    public Product geProductById(@PathVariable int prodId){
        return service.getProductsbyId(prodId);
    }

    // Clint side to Server side
    // @ReqBody
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    // putmapp to update
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }


    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }


}
