package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String getForm(){
      return "form";
    }
    @PostMapping("/form")
    public String postForm(@RequestParam("paramName") String name, @RequestParam String paramDate,
                           @CookieValue("cookie1") String cookie1){

        // Am setat setPath pentru cookie2 /helloView dar aici sunt in alt path: /first/form.
        // cookie1 este disponibil fiindca am setat setPath("/") adica root.

        System.out.println(cookie1);

        System.out.println(name);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date =LocalDate.parse(paramDate, format);
        System.out.println(date);
        return "form";
    }
}
