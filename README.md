spring-example03
================

Spring Config with web app. Shows that a controller stereotype annotation is not needed with scanning, instead compose
a "meta" annotation to specify the class is used for request mappings that return a response body.

Only RequestMapping is needed, see org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping#isHandler.
