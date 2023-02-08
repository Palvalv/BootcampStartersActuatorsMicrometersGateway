package com.nttdata.gateway.bootcamp.filters;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigGateWay {

	@Bean
	public GlobalFilter filter1() {
		return new Filter1();
	}
	
	@Bean
	public GlobalFilter filter2() {
		return new Filter2();
	}
	
	@Bean
	public GlobalFilter filter3() {
		return new Filter3();
	}

}
