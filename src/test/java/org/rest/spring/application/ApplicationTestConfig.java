package org.rest.spring.application;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan( { "org.rest.testing", "org.rest.sec.testing" } )
public class ApplicationTestConfig{
	
	// API
	
	@Bean
	public static PropertyPlaceholderConfigurer properties(){
		final PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		final Resource[] resources = new ClassPathResource[ ] { new ClassPathResource( "persistence-test.properties" ), new ClassPathResource( "web.properties" ) };
		ppc.setLocations( resources );
		ppc.setIgnoreUnresolvablePlaceholders( true );
		return ppc;
	}
	
}
