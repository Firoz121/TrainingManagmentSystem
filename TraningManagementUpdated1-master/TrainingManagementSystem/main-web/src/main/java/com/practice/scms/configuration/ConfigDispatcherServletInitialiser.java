package com.practice.scms.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * This class initalize springtootcofig and webconfg and configure url mapping.
 * @author firoz
 *
 */
public class ConfigDispatcherServletInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[]{SpringRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {SpringWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"} ;
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		super.onStartup(servletContext);
	}

}
