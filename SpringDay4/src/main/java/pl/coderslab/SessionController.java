package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String session(HttpSession session) {
        Object loginStart = session.getAttribute("loginStart");
        if (loginStart == null) {
            session.setAttribute("loginStart", LocalDateTime.now());
            return "You just logged in";
        } else {
            return loginStart.toString();
        }
    }
}
