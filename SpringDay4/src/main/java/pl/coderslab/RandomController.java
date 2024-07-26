package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/showRandom")
    @ResponseBody
    public String showRandom() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return "The number drawn: " + randomInt;
    }

    @GetMapping("/random/{max}")
    @ResponseBody
    public String ex1Parameters(@PathVariable int max) {
        Random random = new Random();
        int randomInt = random.nextInt(max);
        return "User entered the value " + max + ". The following number was drawn: . " + randomInt;
    }

    @GetMapping("/random/{max}/{min}")
    @ResponseBody
    public String ex2Parameters (@PathVariable int max, @PathVariable int min) {
        Random random = new Random();

        int randomInt = random.nextInt(max-min+1)+min;

        return "User entered the values min =  " + min + ", " + max + ". The following number was drawn: . " + randomInt;
    }
}
