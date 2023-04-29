package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @decription:
 * @date: 2023/4/25 20:50
 * @author: ouchujian@xinpayroll.com
 * @since:
 **/
@RestController
public class TestController {

    @RequestMapping("test")
    public Map<String, Object> test(){
        Map<String,Object> result = new HashMap<>();
        result.put("gggg", UUID.randomUUID().toString());
        return result;
    }

}
