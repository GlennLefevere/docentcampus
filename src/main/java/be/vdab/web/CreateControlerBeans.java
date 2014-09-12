package be.vdab.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class CreateControlerBeans {

	@Bean
	public DefaultWsdl11Definition docentCampus(XsdSchema docenSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("docentCampus");
		definition.setLocationUri("http://localhost:8080/DocentCampus/");
		definition.setTargetNamespace("http://mycompany.com/hr/schemas");
		definition.setSchema(docenSchema);
		return definition;
	}

	@Bean
	public XsdSchema docenSchema() {
		return new SimpleXsdSchema(new ClassPathResource("DocentCampusSchema.xsd"));
	}
}
