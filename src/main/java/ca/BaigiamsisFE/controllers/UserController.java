package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {

    private final RestTemplate restTemplate;

    public UserController(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/register/newUser")
    public String newUser(User user, BindingResult errors) {
        HttpEntity<String> request =
                new HttpEntity<>(user.toString(), new HttpHeaders());

        restTemplate.postForObject("http://localhost:8081/user/new", request, String.class);
        if (errors.hasErrors()) {
            return "/home";
        }
        return "redirect:/login";
    }

}
