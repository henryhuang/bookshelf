package io.github.henryhuang.bookshelf.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Henry Huang
 * @create 2017-12-27 14:49:30
 */
//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  // TODO should be encrypted
  private static final String PASSWORD_ENCODER = "bookshelf";

//  @Autowired
//  private UserDetailsService userDetailsService;

//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userDetailsService);
//  }

//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.csrf().disable()
//        .formLogin()
//        .loginPage("/admin/login")
//        .and()
//        .logout()
//        .logoutSuccessUrl("/")
//        .and()
//        .authorizeRequests()
//        .antMatchers("/admin/login").access("permitAll()")
//        .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
//        .anyRequest().permitAll();
//  }

}
