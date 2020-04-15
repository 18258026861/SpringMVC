package controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YZY
 * @date 2020/4/15 - 17:37
 */
@RestController
public class fastController {

    @RequestMapping("/fast")
    public String view(){
        User user = new User("YY",22);
        User user1 = new User("YzY",22);
        User user21 = new User("z",22);

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user21);

        String s = JSON.toJSONString(list);
//        json转java
//        Object parse = JSON.parse(s);
        return s;
    }


}
