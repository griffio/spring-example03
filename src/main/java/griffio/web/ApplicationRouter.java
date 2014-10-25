package griffio.web;

import griffio.beans.annotation.UseResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@UseResponseBody
public class ApplicationRouter {

    @RequestMapping(value = "/greeting", produces = "text/plain")
    public String greeting() {
        return "Hello and welcome";
    }

}
