package com.manoj.myWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoj.myWebApp.model.Product;

// Spring data Repository will take care of methods by adding JpaRep<classname, primary-key>
// So it will create class, and then object of it automatically.
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    // No need to write any method here, Spring will automatically create them.
    // No need to write any query.
    
}
