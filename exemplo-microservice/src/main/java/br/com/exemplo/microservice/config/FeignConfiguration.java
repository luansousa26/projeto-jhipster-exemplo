package br.com.exemplo.microservice.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "br.com.exemplo.microservice")
public class FeignConfiguration {

}
