package griffio.web;

import griffio.beans.annotation.Router;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Router
@RequestMapping
public class ApplicationRouter {

    @RequestMapping(value = "/greeting", produces = "text/plain")
    @ResponseBody
    public String greeting() {
        return "Hello and welcome";
    }

}
