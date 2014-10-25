package griffio.beans.configuration;

import griffio.beans.annotation.UseResponseBody;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "griffio.web", includeFilters = @ComponentScan.Filter(UseResponseBody.class), useDefaultFilters = false)
public class ApplicationConfiguration {
}