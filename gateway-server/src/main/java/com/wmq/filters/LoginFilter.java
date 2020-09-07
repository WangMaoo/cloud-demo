package com.wmq.filters;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月07日 20:01:00
 * @Description: TODO
 */
@Component
@Order(0)
public class LoginFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getQueryParams().toSingleValueMap().get("access-token");
        if (StringUtils.equals(token, "admin")) {
            /**
             * 放行
             */
            return chain.filter(exchange);
        }
        /**
         * 错误需要拦截，设置状态码
         */
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        /**
         * 结束任务
         */
        return exchange.getResponse().setComplete();
    }
}
