package com.product.service;

import com.product.DAO.ProductRepository;
import com.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // to get all product Details
    public List<Product> getAllProducts(){
        List<Product> productList = this.productRepository.findAll();
        return productList;
    }

    //fetch product details by id
    public Product getProductById(int id){
        Product product = null;
        try{
            product = this.productRepository.findById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    // To add a new product
    public Product addProduct(Product product){
        Product result = this.productRepository.save(product);
        return result;
    }

    //delete product
    public void deleteProduct(Integer id){this.productRepository.deleteById(id);}

    //update product details
    public void updateProduct(Product product, int id){
        product.setId(id);
        productRepository.save(product);
    }
}
