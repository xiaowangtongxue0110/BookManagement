package gentleman.Controller;

import com.alibaba.fastjson.JSON;
import gentleman.bean.reader_info;
import gentleman.service.reader_infoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Reader_infoController {
          @Autowired
          private reader_infoservice reader;

          @GetMapping("/reader")
          public String  selectAllreader_info(){
              List<reader_info> readers = reader.selectAllreader_info();
              return JSON.toJSONString(readers);
          }

          @PostMapping("/reader")
    public String insertreader(@RequestBody reader_info re){
              int i = reader.insertSelective(re);
              System.out.println(i);
              if(i==1){
                  return JSON.toJSONString("success");
              }else {
                  return JSON.toJSONString("fail");
              }
          }
}
