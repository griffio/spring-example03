package griffio.web;

import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class StandaloneRouterTest {

    MockMvc mockMvc;

    ApplicationRouter router;

    @BeforeTest
    public void setup() {
        router = new ApplicationRouter();
        mockMvc = standaloneSetup(router).build();
    }

    @Test
    public void that_greeting_route_returned_content() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andDo(print())
                .andExpect(content().string(router.greeting()));
    }

}