package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.Helmet;
import ca.BaigiamsisFE.entities.Helmets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelmetController {

    private final RestTemplate restTemplate;

    public HelmetController(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @GetMapping("/helmets/price/{price}")
//    public ResponseEntity<Helmet[]> helmetByPrice(@PathVariable int price) {
//        return new ResponseEntity<>(
//                restTemplate.getForObject("http://localhost:8081/helmet/price/" + price,
//                        Helmet[].class),
//                HttpStatus.OK
//        );
//    }
//    @GetMapping("/helmets/size/{size}")
//    public ResponseEntity<Helmet[]> helmetBySize(@PathVariable String size) {
//        return new ResponseEntity<>(
//                restTemplate.getForObject("http://localhost:8081/helmet/size/"+ size,
//                        Helmet[].class),
//                HttpStatus.OK
//        );
//    }
//    @GetMapping("/helmets/color/{color}")
//    public String  helmetByColor(@PathVariable String color, Model model) {
//            var byColor = restTemplate.getForObject("http://localhost:8081/helmet/color/" + color,
//                        Helmet[].class);
//            model.addAttribute("helmets", byColor);
//            return "/pages/home";
//    }
//    @GetMapping("/helmets/type/{type}")
//    public String helmetByType (@PathVariable String type, Model model) {
//         var byType = restTemplate.getForObject("http://localhost:8081/helmet/type/" + type,
//                        Helmet[].class);
//         model.addAttribute("helmets", byType);
//        return "/pages/home";
//    }
//

}
