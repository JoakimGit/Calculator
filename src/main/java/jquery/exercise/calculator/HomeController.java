package jquery.exercise.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.out.println("Going to calculator");
        return "/mycalc";
    }

    @GetMapping("/mycalc")
    public String myhome() {
        System.out.println("Also going to calculator");
        return "/mycalc";
    }
}
