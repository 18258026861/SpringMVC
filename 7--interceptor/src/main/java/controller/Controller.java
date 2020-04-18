package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author YZY
 * @date 2020/4/18 - 12:15
 */
@RestController
public class Controller {

    @RequestMapping("/hi")
    public String view(){
        System.out.println("do view");
        return "hi";
    }



}
