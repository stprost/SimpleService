package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import response.Respone;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("")
    public @ResponseBody
    Respone getResponse(@RequestParam String year) {
        return new Respone(year);
    }
}
