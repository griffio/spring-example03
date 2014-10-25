package griffio.web;

import griffio.beans.configuration.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@WebAppConfiguration
@ContextConfiguration(classes = { ApplicationConfiguration.class })
@Test
public class ContextRouterTest extends AbstractTestNGSpringContextTests {

    MockMvc mockMvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    ApplicationRouter router;

    @BeforeMethod
    public void setup() {
        router = new ApplicationRouter();
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    public void that_greeting_route_returned_content() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andDo(print())
                .andExpect(content().string(router.greeting()));
    }

}
