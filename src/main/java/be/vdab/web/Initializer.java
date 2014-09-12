package be.vdab.web;

import org.springframework.ws.transport.http.support.AbstractAnnotationConfigMessageDispatcherServletInitializer;

import be.vdab.DAO.CreateDAOBeans;
import be.vdab.datasource.CreateDataSourceBean;
import be.vdab.services.CreateServiceBeans;
import be.vdab.ws.DocentCampusEndpoint;

public class Initializer extends AbstractAnnotationConfigMessageDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{CreateControlerBeans.class, CreateDAOBeans.class, CreateDataSourceBean.class, CreateServiceBeans.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{DocentCampusEndpoint.class};
	}

}