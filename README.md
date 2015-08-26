spring-example03
================

Spring 4.2.0.RELEASE

Spring Config for a simple Web app.
Shows that a controller stereotype annotation is not needed, instead compose a "meta" annotation to specify the class is being used for request mappings that also return a response body(Effectively @RestController).

Only RequestMapping is needed for use in MVC.
See org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping#isHandler.
