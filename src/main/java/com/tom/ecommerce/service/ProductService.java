package com.tom.ecommerce.service;

import com.tom.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList=new ArrayList<Product>();
    Product pr = new Product();
    Product pr2 = new Product();
    Product pr3 = new Product();
    public ProductService() {
        // Constructor: You can initialize objects here

        pr.setProdId(1);
        pr.setProdName("iPhone 20 pro max");
        pr.setProdDesc("Haters will say, its waste of money😏");
        pr.setProdPrice(3000000);
        pr.setProdOwner("Tom");
        productList.add(pr);

        pr2.setProdId(2);
        pr2.setProdName("Nokia 33310");
        pr2.setProdDesc("Old is gold, gold is bold 📱");
        pr2.setProdPrice(100);
        pr2.setProdOwner("Tom");
        productList.add(pr2);

        pr3.setProdId(3);
        pr3.setProdName("Apsara Pencil");
        pr3.setProdDesc("Extra marks for good handwriting ✏️");
        pr3.setProdPrice(5);
        pr3.setProdOwner("Tom");
        productList.add(pr3);

    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductById(long productId) {
        for (Product product : productList) {
            if (product.getProdId() == productId) {
                return product; // Product found, return it
            }
        }
        return null; // Product not found, return null
    }

}
