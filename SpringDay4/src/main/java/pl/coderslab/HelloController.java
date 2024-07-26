package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    @GetMapping("/helloView/{color}/{backgroundColor}")
    public String helloView(@PathVariable String color, @PathVariable String backgroundColor, Model model) {

        model.addAttribute("color", color);
        model.addAttribute("backgroundColor", backgroundColor);

        // business logic pentru color si backgroundColor:

        return "home";
    }

}
