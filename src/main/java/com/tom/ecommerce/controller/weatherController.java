package com.tom.ecommerce.controller;

import com.tom.ecommerce.Dto.CityDto;
import com.tom.ecommerce.Dto.FakeStoryDto;
import com.tom.ecommerce.Dto.weatherDto;
import com.tom.ecommerce.Service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class weatherController {

    private WeatherService wsr;
    public weatherController(WeatherService wether){
        this.wsr = wether;
    }

    @GetMapping("/{city}")
    public @ResponseBody weatherDto getWeatheByCity(@PathVariable("city") String city) throws Exception {
        return wsr.getCityDetails(city);
    }
    @GetMapping("/cityname/{id}")
    public @ResponseBody weatherDto getWeatheById(@PathVariable("id") long id) throws Exception {
        return wsr.getCityByid(id);
    }
}
