package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HeaderController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }

}
