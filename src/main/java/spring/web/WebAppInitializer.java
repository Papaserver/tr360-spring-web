package spring.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spring.web.controller.WebConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Ez a back-end réteget konfigurálja
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //A web réteget konfigurálja
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //Milyen URL-en figyeljen a spring dispatcher (a / azt jelenti, hogy az összesen)
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
