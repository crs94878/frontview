package present.quest.frontview.view.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Start {

    @RequestMapping("/hello")
    public String start(){
        return "greeting";
    }
}
