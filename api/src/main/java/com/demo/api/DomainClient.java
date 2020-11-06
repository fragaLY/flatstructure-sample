package com.demo.api;

import com.demo.config.FeignAutoConfiguration;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.cloud.openfeign.FeignClient;

/** @author Vadzim_Kavalkou */
@Hidden
@FeignClient(
        url = FeignAutoConfiguration.SERVICE_URL,
        name = FeignAutoConfiguration.SERVICE_FEIGN_NAME,
        contextId = "domain-client",
        configuration = FeignAutoConfiguration.class)
public interface DomainClient extends Api {}
