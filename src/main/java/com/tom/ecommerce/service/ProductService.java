package com.tom.ecommerce.service;

import com.tom.ecommerce.dto.ProductDTO;
import com.tom.ecommerce.entity.Product;
import com.tom.ecommerce.exception.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.*;

@Service
public class ProductService {

    List<ProductDTO> productList=new ArrayList<ProductDTO>();
    Product pr = new Product();
    Product pr2 = new Product();
    Product pr3 = new Product();

    @Autowired
    RestTemplate restTemplate;

    String url = "https://fakestoreapi.com/products/";
    Product[] products=restTemplate.getForObject(url, Product[].class);

    public ProductDTO convertDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setTitle(product.getTitle());

        return productDTO;
    }

    public ProductService() {
        // Constructor: You can initialize objects here

        pr.setId(1);
        pr.setTitle("iPhone 20 pro max");
        pr.setProdDesc("Haters will say, its waste of money😏");
        pr.setProdPrice(3000000);
        pr.setProdOwner("Tom");
        //productList.add(pr);

        pr2.setId(2);
        pr2.setTitle("Nokia 33310");
        pr2.setProdDesc("Old is gold, gold is bold 📱");
        pr2.setProdPrice(100);
        pr2.setProdOwner("Tom");
       // productList.add(pr2);

        pr3.setId(3);
        pr3.setTitle("Apsara Pencil");
        pr3.setProdDesc("Extra marks for good handwriting ✏️");
        pr3.setProdPrice(5);
        pr3.setProdOwner("Tom");
        //productList.add(pr3);

    }

    public List<ProductDTO> getProductList() {

        for(Product product:products){
            productList.add(convertDTO(product));
        }
                return productList;
    }

    public ProductDTO getProductById(long id) throws Exception{
            ProductDTO productDTO = null;
            for (Product product : products) {
                //System.out.println(product.getId());
                if (product.getId() == id) {
                    productDTO=convertDTO(product); // Product found, return it
                }
            }
            if(productDTO==null)
                throw new ProductException("No Product ");

            return productDTO;
    }

}
