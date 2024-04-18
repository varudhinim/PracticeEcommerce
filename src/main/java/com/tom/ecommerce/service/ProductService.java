package com.tom.ecommerce.Service;

import com.tom.ecommerce.Dto.FakeStoryDto;
import com.tom.ecommerce.Dto.GetproductDto;
import com.tom.ecommerce.Exceptions.fakeStroyNotFoundException;
import com.tom.ecommerce.models.Product;
import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {

    public GetproductDto getProductById(Long id){
       GetproductDto obj = new GetproductDto();
       obj.setName("TV");
       obj.setPrice(13478.0);
       obj.setImgUrl("www.LGTV.com");
       return obj;
    }

    public FakeStoryDto getFakeProductBYId(Long id)throws fakeStroyNotFoundException{
        RestTemplate  rest = new RestTemplate();
        String url = "https://fakestoreapi.com/products/" +id;
        FakeStoryDto faketyped = rest.getForObject(url, FakeStoryDto.class);
        // System.out.println(fkpr);

        if(faketyped == null){
            throw new fakeStroyNotFoundException();
        }
        return converToDto(faketyped);
    }

    private static FakeStoryDto converToDto (FakeStoryDto faketyped){
        FakeStoryDto obj = new FakeStoryDto();
        obj.setTitle(faketyped.getTitle());
        obj.setPrice(faketyped.getPrice());
        obj.setImg(faketyped.getImg());
        obj.setId(faketyped.getId());
        obj.setDescription(faketyped.getDescription());
        return obj;
    }

    public List<FakeStoryDto> getAllProducts(){
        RestTemplate rest = new RestTemplate();
        String url = "https://fakestoreapi.com/products/";
        FakeStoryDto[] faketype = rest.getForObject(url, FakeStoryDto[].class);

        List<FakeStoryDto> returnedProducts = new ArrayList<>();
        //we are getting List of products
        //we need each product of type FakeStoryDto from the list
        for(FakeStoryDto product:  faketype){
            returnedProducts.add(converToDto(product));
        }
        return returnedProducts;
    }

}
