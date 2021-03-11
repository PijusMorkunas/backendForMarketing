package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String viewHome() {

        return "home";
    }
}
