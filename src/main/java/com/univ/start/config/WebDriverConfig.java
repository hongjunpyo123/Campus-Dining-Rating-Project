package com.univ.start.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {
  @Bean
  public WebDriver webDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments(new String[]{"--headless"});
    options.addArguments(new String[]{"user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"});
    return new ChromeDriver(options);
  }
}