package com.tom.ecommerce.controller;

import com.tom.ecommerce.Dto.FakeStoryDto;
import com.tom.ecommerce.Service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fakeStory/Products")
public class FakeStroyProductsController {

    private ProductService prds;

    private FakeStroyProductsController(ProductService ps) {
        this.prds = ps;
    }

    @GetMapping("/{id}")
    public @ResponseBody FakeStoryDto getProductBYIdfake(@PathVariable("id") Long id){
        return prds.getFakeProductBYId(id);
    }
    @GetMapping("")
    public String fakeStory(){
        return "From fakeStry Controller ";
    }

}
