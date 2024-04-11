package com.example.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
      http
          .authorizeRequests()
              .antMatchers("/hello").authenticated() // "/hello"へのアクセスは認証済みユーザーのみ許可
              .anyRequest().permitAll() // 他のリクエストは認証なしで許可
          .and()
          .formLogin(); // デフォルトのログインフォームを使用
  }
}
