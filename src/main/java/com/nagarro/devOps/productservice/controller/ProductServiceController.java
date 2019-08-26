package com.nagarro.devops.productservice.controller;

import com.nagarro.devops.productservice.beans.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductServiceController {

    @GetMapping("/products")
    public List<Products> fetchProductsList()
    {
        List<Products> productsList = new ArrayList<>();
        Products p1 = new Products(1, "product1", 200D, "A");
        productsList.add(p1);
        Products p2 = new Products(2, "product2", 400D, "B");
        productsList.add(p2);
        return productsList;
    }

}
