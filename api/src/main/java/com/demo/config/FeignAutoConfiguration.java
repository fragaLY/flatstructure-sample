package com.demo.config;

import com.demo.api.DomainClient;
import feign.Feign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/** @author Vadzim_Kavalkou */
@Configuration
@Profile("!test")
@ConditionalOnClass(Feign.class)
@EnableFeignClients(basePackageClasses = DomainClient.class)
@ConditionalOnMissingBean(type = "com.demo.DomainApplication")
public class FeignAutoConfiguration {
    public static final String SERVICE_URL = "http://${domain.host:localhost}:${domain.port:8080}";
    public static final String SERVICE_FEIGN_NAME = "domain-service";
}
