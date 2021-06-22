package com.example.BeanValidationSpringBoot.controller;

import com.example.BeanValidationSpringBoot.model.User;
import com.example.BeanValidationSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService productService;

    @PostMapping("/addUser")
    public User addProduct(@RequestBody User product){
        return  productService.saveProduct(product);
    }
    @PostMapping("/addAllUser")
    public List<User> addProducts(@RequestBody  List<User> products){
        return  productService.saveProducts(products);
    }

    @GetMapping("/getUsers")
    public  List<User> findAllProduct(){
        return  productService.getProducts();
    }

    @GetMapping("/getUserById/{id}")
    public  User findAllProducts(@PathVariable int id){
        return  productService.getProductsById(id);
    }
/*
    @GetMapping("/getProductsByName/{name}")
    public  Product findAllProducts(@PathVariable String  name){
        return  productService.getProductsByName(name);
    }*/

    @DeleteMapping("/deleteById/{id}")
    public  String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "Product delete "+id; }


    @PutMapping("/update")
    public  User updateProduct(@RequestBody User product){
        return  productService.updateProduct(product);
    }





}
