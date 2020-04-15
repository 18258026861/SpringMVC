package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author YZY
 * @date 2020/4/15 - 15:45
 */
//提取公用的，供其他调用
public class Jsonutil {
//    1个参数，固定时间格式，只需传内容
    public static String getJson(Object object){
//        重载，方法调方法，不要重复造轮子
        return getJson(object,"yyyy-MM-dd HH-mm-ss");
    }


// 两个参数的方法：内容和时间格式
    public static String getJson(Object object,String DateFormat) {
        ObjectMapper mapper = new ObjectMapper();
//        关闭时间戳格式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
//        传入时间格式
        SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
//        ObjectMapping套用时间格式
        mapper.setDateFormat(sdf);
        try {
            return(mapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }

}
