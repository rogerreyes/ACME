package co.com.uni5d.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Inicializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	
	
	 @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { Configuracion.class };
	    }
	   
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	        //return new Class[] {WebConfiguration .class};
	    }
	   
	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }
	     
	    @Override
	    protected Filter[] getServletFilters() {
	        Filter [] singleton = { new CORSFilter() };
	        return singleton;
	    }
}
