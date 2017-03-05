package br.com.infnet.pizzaria;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Aplicacao implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = buildApplicationContext();
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(applicationContext));
		appServlet.setLoadOnStartup(1);	
	}

	
	private AnnotationConfigWebApplicationContext buildApplicationContext(){
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("br.fatea.simplebank.config");
		return webApplicationContext;
	}
	
	
	
}
