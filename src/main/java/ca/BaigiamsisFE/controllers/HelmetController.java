package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.Helmet;
import ca.BaigiamsisFE.entities.Helmets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HelmetController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/helmets")
    public ResponseEntity<Helmets> allHelmets() {
        return new ResponseEntity<>(
                restTemplate.getForObject("http://localhost:8081/helmets", Helmets.class),
                HttpStatus.OK
        );
    }

    @GetMapping("/helmets/price/{price}")
    public ResponseEntity<Helmet[]> helmetByPrice(@PathVariable int price) {
        return new ResponseEntity<>(
                restTemplate.getForObject("http://localhost:8081/helmet/price/" + price,
                        Helmet[].class),
                HttpStatus.OK
        );
    }
    @GetMapping("/helmets/size/{size}")
    public ResponseEntity<Helmet[]> helmetBySize(@PathVariable String size) {
        return new ResponseEntity<>(
                restTemplate.getForObject("http://localhost:8081/helmet/size/"+ size,
                        Helmet[].class),
                HttpStatus.OK
        );
    }
    @GetMapping("/helmets/color/{color}")
    public ResponseEntity<Helmet[]> helmetByColor(@PathVariable String color) {
        return new ResponseEntity<>(
                restTemplate.getForObject("http://localhost:8081/helmet/color/" + color,
                        Helmet[].class),
                HttpStatus.OK
        );
    }
    @GetMapping("/helmets/type/{type}")
    public ResponseEntity<Helmet[]> helmetByType (@PathVariable String type) {
        return new ResponseEntity<>(
                restTemplate.getForObject("http://localhost:8081/helmet/type/" + type,
                        Helmet[].class),
                HttpStatus.OK
                );
    }
}
