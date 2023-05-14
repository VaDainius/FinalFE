package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.Helmet;
import ca.BaigiamsisFE.entities.Helmets;
import ca.BaigiamsisFE.entities.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ShoppingCartController {

    private final RestTemplate restTemplate;

    public ShoppingCartController(@Autowired RestTemplate restTemplate) {;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/cart")
    public String cartPage(Model model) {
        var fromBE = restTemplate.getForObject("http://localhost:8081/helmets", ShoppingCart.class);
        model.addAttribute("cart", fromBE);
        return "/pages/cart";
    }

    @PostMapping("/cart")
    public String putToCart(Helmet helmet, BindingResult errors) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Helmet> request = new HttpEntity<>(helmet, headers);
        restTemplate.postForObject("http://localhost:8081/cart/put", request, String.class);
        if (errors.hasErrors()) {
            return "/pages/home";

        }
        return "redirect:/main";
    }
}

