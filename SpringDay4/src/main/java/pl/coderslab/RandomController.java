package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/showRandom")
    @ResponseBody
    public String showRandom(){
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return "The number drawn: "+randomInt;
    }
}
