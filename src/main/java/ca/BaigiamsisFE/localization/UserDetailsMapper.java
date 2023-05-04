//package ca.BaigiamsisFE.localization;
//
//import ca.BaigiamsisFE.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class UserDetailsMapper implements UserDetails {
//    private final User user;
//    private final RestTemplate restTemplate;
//
//    public UserDetailsMapper(@Autowired User user, @Autowired RestTemplate restTemplate) {
//        this.user = user;
//        this.restTemplate = restTemplate;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        var getRol = restTemplate.getForObject("http://localhost:8081/users", User[].class);
//        var str = Arrays.stream(getRol).toList().toString();
//        authorities.add(new SimpleGrantedAuthority("ROLE_" + str));
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        var getRol = restTemplate.getForObject("http://localhost:8081/users", User[].class);
//        var str = Arrays.stream(getRol).toList().toString();
//        return str;
//    }
//
//    @Override
//    public String getUsername() {
//        var getRol = restTemplate.getForObject("http://localhost:8081/users", User[].class);
//        var str = Arrays.stream(getRol).toList().toString();
//        return str;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
