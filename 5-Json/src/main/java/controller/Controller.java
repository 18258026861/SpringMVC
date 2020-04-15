package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import util.Jsonutil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;
import util.Jsonutil;

/**
 * @author YZY
 * @date 2020/4/15 - 11:29
 */
//@org.springframework.stereotype.Controller
@RestController
public class Controller {


    @RequestMapping("/json")
//    不会走视图解析器，直接返回一个字符串
//    @ResponseBody
    public String view() throws JsonProcessingException {
        User user = new User("尹振宇",22);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/jsons")
    public String view2() throws JsonProcessingException {
        List<User> users = new ArrayList<>();

        User user1 = new User("YY",22);
        User user2 = new User("YzY",23);
        User user3 = new User("YyY",21);
        users.add(user1);
        users.add(user2);
        users.add(user3);


        return Jsonutil.getJson(users);
    }

    @RequestMapping("/jsontime")
    public String view3() throws JsonProcessingException {
        Date date = new Date();

//    显示的是时间戳：1586935126749
//        return mapper.writeValueAsString(date);

//        自定义日期格式
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        显示的是"2020-04-15 15:33:35"
//        return mapper.writeValueAsString(sim.format(date));


       return Jsonutil.getJson(date);
    }
}
