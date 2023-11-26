package com.idele.fish.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 全局过滤器，不需要配置，默认会作用于所有的路由
 * 全局过滤器可以有多个，通过Order设置顺序
 *
 * @author idle fish
 * @since 2023/11/25
 */
@Order(1)
@Slf4j
@Component
public class RequestUriLogFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String uri = request.getURI().toString();
        log.info("uri:{}", uri);
        return chain.filter(exchange);
    }
}
