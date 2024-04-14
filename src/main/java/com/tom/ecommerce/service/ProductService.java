package com.tom.ecommerce.Service;

import com.tom.ecommerce.Dto.FakeStoryDto;
import com.tom.ecommerce.Dto.GetproductDto;
import com.tom.ecommerce.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class ProductService {

    public GetproductDto getProductById(Long id){
       GetproductDto obj = new GetproductDto();
       obj.setName("TV");
       obj.setPrice(13478.0);
       obj.setImgUrl("www.LGTV.com");
       return obj;
    }

    public FakeStoryDto getFakeProductBYId(Long id){
        RestTemplate  rest = new RestTemplate();
        String url = "https://fakestoreapi.com/products/" +id;
        FakeStoryDto faketyped = rest.getForObject(url, FakeStoryDto.class);
        // System.out.println(fkpr);


        FakeStoryDto obj = new FakeStoryDto();
        obj.setTitle(faketyped.getTitle());
        obj.setPrice(faketyped.getPrice());
        obj.setImg(faketyped.getImg());
        obj.setId(faketyped.getId());
        obj.setDescription(faketyped.getDescription());
        return obj;
    }

}
