package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Controller
public class HomeController {

    private final RestTemplate restTemplate;

    public HomeController(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/index")
    public String home(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUsername = authentication.getName();

        var fromBE = restTemplate.getForObject("http://localhost:8081/users", User[].class);
        System.out.println("---------------------------------------------");
//        if (fromBE.getUsername().equalsIgnoreCase(currentUsername)) {
         model.addAttribute("current", currentUsername);
         model.addAttribute("users", fromBE);
//        }
        return "/index";
    }
}
