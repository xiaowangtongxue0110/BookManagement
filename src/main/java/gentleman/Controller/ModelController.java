package gentleman.Controller;

import com.alibaba.fastjson.JSON;
import gentleman.bean.User;
import gentleman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Controller
public class ModelController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String requestlogin(String username, String password,Boolean remember){
        User user = userService.selectLoginUserAndPassword(username, password);
        if(user!=null){
            if(remember==true){
                 return JSON.toJSONString("remember1");
            }
            return JSON.toJSONString("success");
        }else {
            return JSON.toJSONString("fail");
        }
    }


    @RequestMapping("/findPassword")
    @ResponseBody
   public String findPassword(String username,String phone){
        User user = userService.findPassword(username, phone);
        if(user==null){
             return JSON.toJSONString("fail");
        }else {
            return JSON.toJSONString("success");
        }
    }

    @RequestMapping("/updateFindPassword")
    @ResponseBody
    public String updateFindPassword(String username,String password){
        String username1 = null;
        try {
            username1 = URLDecoder.decode(username, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            userService.updateFindPassword(username1,password);
            return JSON.toJSONString("success");
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString("fail");
        }
    }




}
