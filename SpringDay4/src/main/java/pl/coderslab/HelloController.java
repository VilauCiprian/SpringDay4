package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {

    @GetMapping("/helloView/{color}/{backgroundColor}")
    public String helloView(@PathVariable String color, @PathVariable String backgroundColor,
                            Model model,
                            @CookieValue("cookie1") String cookie1,
                            @CookieValue("cookie2") String cookie2) {

        System.out.println(cookie1);
        System.out.println(cookie2);

        model.addAttribute("color", color);
        model.addAttribute("backgroundColor", backgroundColor);

        // business logic pentru color si backgroundColor:

        return "home";
    }

    @RequestMapping("/cookieSet")
    @ResponseBody
    public String homeJsp(HttpServletResponse response){
        Cookie cookie1 = new Cookie("cookie1", "value1");
        Cookie cookie2 = new Cookie("cookie2", "value2");
        cookie1.setPath("/");
        cookie2.setPath("/helloView");
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return "setCookies";
    }

}
