package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping(value = "/welcome")
    @ResponseBody
    public String welcomePage(Locale locale) {
        return locale.toLanguageTag();
    }
}