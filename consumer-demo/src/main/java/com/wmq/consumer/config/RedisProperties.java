package com.wmq.consumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月09日 19:34:00
 * @Description: TODO
 */
@Data
@Component
@ConfigurationProperties(prefix = "test.redis")
public class RedisProperties {
    private String host;
    private int port;
}
