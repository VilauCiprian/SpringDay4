package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class FormController {
    @GetMapping("/form")
    public String getForm(){
      return "form.jsp";
    }
    @PostMapping("/form")
    public String postForm(@RequestParam("paramName") String name, @RequestParam String paramDate){
        System.out.println(name);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date =LocalDate.parse(paramDate, format);
        System.out.println(date);
        return "form.jsp";
    }
}
