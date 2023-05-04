package ca.BaigiamsisFE.controllers;

import ca.BaigiamsisFE.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AdminController {

    private final RestTemplate restTemplate;

    public AdminController(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/admin/allUsers")
    public String AllUsers(Model model) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUsername = authentication.getName();

        var fromBE = restTemplate.getForObject("http://localhost:8081/users", User[].class);
//        model.addAttribute(currentUsername);
        model.addAttribute(fromBE);
        return "/pages/admin/allUsers";
    }
    @DeleteMapping("/admin/allUsers/{username}")
    public String deleteUserByUsername(@PathVariable String username) {
        restTemplate.delete("http://localhost:8081/user/delete/username/" + username, User[].class);
        return "redirect:/pages/admin/allUsers";
    }
}
