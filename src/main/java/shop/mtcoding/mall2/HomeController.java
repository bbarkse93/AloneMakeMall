package shop.mtcoding.mall2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/write")
    public String write(){
        return "write";
    }
}
