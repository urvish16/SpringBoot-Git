package com.product.DAO;

import com.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //to fetch data from Id
    public Product findById(int id);

}
