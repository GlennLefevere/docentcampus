package be.vdab.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@Configuration
public class CreateControlerBeans {
	
	@Bean
	public SimpleWsdl11Definition orders() {
		return new SimpleWsdl11Definition(new ClassPathResource("DocentCampusSchema.xsd"));
	}
}
