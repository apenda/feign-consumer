package com.apenda.core.config;

import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.context.annotation.Bean;
import com.apenda.share.service.ProducerShareService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author rui.zhou
 * @date 2021/10/16 13:53
 **/
@Configuration
public class ApiFeignConfig {

    /**
    * 
    */
    @Value("${api.producer.url}")
    private String baseUrl;

    @Bean
    public ProducerShareService feignClient(){
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .options(new Request.Options())
                .retryer(new Retryer.Default(5000, 5000, 3))
                .target(ProducerShareService.class, baseUrl);
    }

}
