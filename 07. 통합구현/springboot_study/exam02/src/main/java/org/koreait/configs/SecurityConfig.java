package org.koreait.configs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.models.member.LoginFailureHandler;
import org.koreait.models.member.LoginSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.io.IOException;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.formLogin(f -> {
           f.loginPage("/member/login")
                   .usernameParameter("userId")
                   .passwordParameter("userPw")
                   .successHandler(new LoginSuccessHandler())
                   .failureHandler(new LoginFailureHandler());
//                   .successForwardUrl("/") // 성공시 이동할 URL
//                   .failureForwardUrl("/member/login?success=false"); // 실패시 이동할 URL
        });
        http.logout(f -> {
            f.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                    .logoutSuccessUrl("/member/login");
        });
        //회원 인가 - 접근URL 통제
        http.authorizeHttpRequests(c -> {
           c.requestMatchers(new AntPathRequestMatcher("/mypage/**")).authenticated() // 로그인한 경우 접근 가능
                   .requestMatchers(new AntPathRequestMatcher("/admin/**")).hasAuthority("ADMIN") //관리자만 접근가능
                   .anyRequest().permitAll(); // 나머지 주소는 전부 접근 가능
        });

        http.exceptionHandling(c -> {
            c.authenticationEntryPoint((req, resp, e) -> {
                // /mypage -> /member/login
                // /admin -> 401 응답코드
                String URI = req.getRequestURI();
                if(URI.indexOf("/admin") != -1) { // 관리자페이지
                    resp.sendError(HttpServletResponse.SC_UNAUTHORIZED,"접근 권한이 없습니다");
                } else {// 회원전용 페이지
                    resp.sendRedirect(req.getContextPath()+"/member/login");
                }
            });
        });

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
