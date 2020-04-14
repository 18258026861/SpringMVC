package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author YZY
 * @date 2020/4/14 - 13:11
 */
@Controller
public class resultController {

//    add?a=1&b=2

    @RequestMapping("/add")
    public String view(int a, int b, Model model){
        int result = a+b;
        model.addAttribute("msg","结果为"+result);
        return "hi";
    }
//    加上@PathVariable，相当于 "/add/{a}/{b}"
//    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String view2(@PathVariable int a, @PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("msg","结果为"+result);
        return "hi";
    }

    @PostMapping("/add/{a}/{b}")
    public String view3(@PathVariable int a, @PathVariable String b, Model model){
        String result = a+b;
        model.addAttribute("msg","结果为"+result);
        return "hi";
    }

}
