package kr.co.maeulbang.MBB.controller.etc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping()
    public String getHome(){
        return "/home";
    }
}
