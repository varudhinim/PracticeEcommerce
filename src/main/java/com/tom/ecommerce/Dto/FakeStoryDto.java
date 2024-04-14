package com.tom.ecommerce.Dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class FakeStoryDto {

    private Long id;
    private String title;
    private String description;
    private Double price;
    private String img;
    private String category;
    private String seller;
}
