package com.nttdata.gateway.bootcamp.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
public class Filter1 implements GlobalFilter, Ordered {

	@Override
	public int getOrder() {
		return -3;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("first pre filter");
		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
			log.info("third post filter");
		}));

	}

}
