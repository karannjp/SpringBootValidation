package com.example.BeanValidationSpringBoot.service;

import com.example.BeanValidationSpringBoot.jpa.UserRepo;
import com.example.BeanValidationSpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepo productRepository;

    public User saveProduct(User product){
        return  productRepository.save(product);
    }

    public List<User> saveProducts(List<User> products){
        return  productRepository.saveAll(products);
    }
    public List<User> getProducts(){
        return  productRepository.findAll();
    }
    public User getProductsById(int id){
        return  productRepository.findById(id).orElse(null);
    }
    /*
    public Product getProductsByName(String  name){
        return  productRepository.FindByName(name);
    }*/
    public  String deleteProduct(int id){
        productRepository.deleteById(id);
        return  "Product remove from id "+id;
    }


    public  User updateProduct(User product){
        User existing=productRepository.findById(product.getId()).orElse(null);
        existing.setFirst_name(product.getFirst_name());
        existing.setLast_name(product.getLast_name());
        return  productRepository.save(existing);
    }



}
