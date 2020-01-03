package com.rythmos;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.client.RestTemplate;	

@SpringBootApplication
//@PropertySource("classpath:malli.yml")
@EntityScan(basePackageClasses = {
		SampleApp.class,
		Jsr310JpaConverters.class
})
public class SampleApp extends SpringBootServletInitializer {
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SampleApp.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(SampleApp.class, args);
		
		 RestTemplate restTemplate = new RestTemplate(); // Send request with GET method and default Headers. 
		 String result =restTemplate.getForObject("http://api.plos.org/search?q=title:DNA",String.class); 
		 System.out.println(result);
		
	}
}
