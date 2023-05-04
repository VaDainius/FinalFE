package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.Helmet;
import ca.BaigiamsisFE.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Controller
public class HomeController {

    private final User user;
    private final RestTemplate restTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public HomeController(User user, @Autowired RestTemplate restTemplate) {
        this.user = user;
        this.restTemplate = restTemplate;
    }


    @GetMapping("/main")
    public String allHelmetsInMainPage(Model model) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUsername = authentication.getName();

        var fromBE = restTemplate.getForObject("http://localhost:8081/helmets", Helmet[].class);
         model.addAttribute("helmets", fromBE);

        return "/home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        var fromBE = restTemplate.getForObject("http://localhost:8081/users", User[].class);
        model.addAttribute("users", fromBE);
        return "/login";
    }

    @GetMapping("/")
    public String returns(Model model) {
        var getRol = restTemplate.getForObject("http://localhost:8081/users", User[].class);
        logger.info(Arrays.stream(getRol).toList().toString());

        return "/index";
    }
}
