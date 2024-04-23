package com.tom.ecommerce.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CityDto {
    private int id;
    private String name;
    private String country;
    private int population;
    private int timezone;
    private long sunrise;
    private long sunset;
}
