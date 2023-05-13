package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.Helmet;
import ca.BaigiamsisFE.entities.User;
import jakarta.validation.Valid;
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
public class UserController {

    private final RestTemplate restTemplate;

    public UserController(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/register")
    public String newUser() {
        return "/register";
    }

    @PostMapping("/register")
    public String register(User user, BindingResult errors) {
        user.setRole("USER");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<User> request = new HttpEntity<>(user, headers);
        restTemplate.postForObject("http://localhost:8081/user/new", request, String.class);
        if (errors.hasErrors()) {
            return "/home";
        }
        return "redirect:/login";
    }

}
