package sda.restuarant.tallinn3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @GetMapping("/signUp")
    public String signUp(Model model) {
        return "signUp";
    }
}
