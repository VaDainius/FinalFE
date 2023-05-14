package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.Helmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class NewListingController {

    private final RestTemplate restTemplate;

    public NewListingController(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/newHelmet")
    public String newListing() {
        return "/pages/newHelmet";
    }

    @PostMapping("/newHelmet")
    public String newHelmet(Helmet helmet, BindingResult errors) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Helmet> request = new HttpEntity<>(helmet, headers);
        restTemplate.postForObject("http://localhost:8081/helmet/new", request, String.class);
        if (errors.hasErrors()) {
            return "/pages/home";
        }
        return "redirect:/main";
    }


}
