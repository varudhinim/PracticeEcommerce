package com.tom.ecommerce.Service;

import com.tom.ecommerce.Dto.CityDto;
import com.tom.ecommerce.Dto.GetproductDto;
import com.tom.ecommerce.Dto.weatherDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {

String token = "0b85156d4b41aa1085ca356ade722184";
    String url = "https://api.openweathermap.org/data/2.5/forecast";

    public weatherDto getCityDetails(String cityName) {
        RestTemplate rest = new RestTemplate();
        url= url+"?q="+cityName+"&appid="+token;
        weatherDto cityname = rest.getForObject(url, weatherDto.class);
        System.out.println(cityname);
        return cityname;
    }

    public weatherDto getCityByid(Long cityId) {
        RestTemplate rest = new RestTemplate();
        url= url+"?id="+cityId+"&appid="+token;
        weatherDto city = rest.getForObject(url, weatherDto.class);
        return city;

    }
}
