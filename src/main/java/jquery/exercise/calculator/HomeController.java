package jquery.exercise.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "/mycalc";
    }

    @GetMapping("/mycalc")
    public String myhome() {
        return "/mycalc";
    }
}
