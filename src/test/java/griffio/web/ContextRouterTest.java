package griffio.web;

import griffio.beans.configuration.ApplicationConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { ApplicationConfiguration.class })
public class ContextRouterTest extends AbstractTestNGSpringContextTests {

    MockMvc mockMvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    ApplicationRouter router;

    @Before
    public void setup() {
        router = new ApplicationRouter();
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void that_greeting_route_returned_content() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andDo(print())
                .andExpect(content().string(router.greeting()));
    }

}
