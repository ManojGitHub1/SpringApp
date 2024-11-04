package com.manoj.myWebApp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.myWebApp.model.Product;
import com.manoj.myWebApp.repository.ProductRepo;

// All the logic is written in Service class
// and Controller class will just call the methods of Service class

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    
    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product(101, "Iphone", 50000),
    //     new Product(102, "Samsung", 80000),
    //     new Product(103, "Nokia", 70000)
    // ));


    public List<Product> getProducts(){
        // we are getting all these methods from extends JpaRepository

        return repo.findAll();
    }


    public Product getProductsbyId(int prodId) {
        // return products.stream()
        //     .filter(p -> p.getProdId() == prodId)
        //     // .findFirst().get();
        //     .findFirst().orElse(
        //         new Product(100, "No Item", 0)
        //     );

        // using jpa
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        // products.add(prod);
        repo.save(prod);
        // throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }


    public void updateProduct(Product prod) {
        // int index=0;
        // for(int i=0; i<products.size(); i++){
        //     if(products.get(i).getProdId() == prod.getProdId()){
        //         index = i;
        //     }
        // }
        // products.set(index, prod);

        // using jpa
        // it will check if the product is already in the database if yes 
        // it will update it if not it will add it
        repo.save(prod);
    }


    public void deleteProduct(int prodId) {
        // int index=0;
        // for(int i=0; i<products.size(); i++){
        //     if(products.get(i).getProdId() == prodId){
        //         index = i;
        //     }
        // }
        // products.remove(index);

        // using jpa
        repo.deleteById(prodId);

    }

}
