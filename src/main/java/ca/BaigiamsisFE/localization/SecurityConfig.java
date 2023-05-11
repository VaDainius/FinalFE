//package ca.BaigiamsisFE.localization;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http
//                .csrf().disable()
//                .headers().frameOptions().disable()
//            .and()
//                .authorizeHttpRequests().requestMatchers(
//                        "/error", "/style/**", "", "/", "/index", "user/new", "/user/create", "/users/**"
//                        )
//                .permitAll()
//            .and()
//                .authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN")
//                .anyRequest()
//                .authenticated()
//            .and()
//                .formLogin()
//                .loginPage("/login")
//                .usernameParameter("username")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/home")
//                .permitAll()
//            .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/index")
//                .permitAll()
//            .and()
//                .build();
//    }
//}
