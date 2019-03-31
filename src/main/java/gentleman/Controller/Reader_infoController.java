package gentleman.Controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import gentleman.bean.reader_info;
import gentleman.service.reader_infoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@RestController
public class Reader_infoController {
          @Autowired
          private reader_infoservice reader;

          @GetMapping("/reader")
          public String selectAllreader_info(@RequestParam Map<String, Object> params){
              int page = Integer.parseInt(params.get("page").toString());
              int limit = Integer.parseInt(params.get("limit").toString());
              PageHelper.startPage(page,limit);
              List<reader_info> reader_infos = reader.selectAllreader_info(page, limit);
              PageInfo<reader_info> rd = new PageInfo<>(reader_infos);
              int r = (int) rd.getTotal();
              HashMap<String, Object> map = new HashMap<>();
              map.put("list",reader_infos);
              map.put("totalCount",r);
              map.put("currPage",page);
              int sum = (int) Math.ceil(r/limit)+1;
              map.put("totalPage",sum);
              return JSON.toJSONString(map);
          }

          @GetMapping("/readers/{readerId}")
          public String selectByPrimaryKey(@PathVariable Integer readerId){
              reader_info reader_info = reader.selectByPrimaryKey(readerId);
              if(reader_info!=null){
                  return JSON.toJSONString(reader_info);
              }else {
                  return JSON.toJSONString("fail");
              }
          }

          @PostMapping("/reader")
    public String insertreader(@RequestBody reader_info re){
              int i = reader.insertSelective(re);
              if(i==1){
                  return JSON.toJSONString("success");
              }else {
                  return JSON.toJSONString("fail");
              }
          }

                @PutMapping("/reader/{readerId}")
    public String updateByPrimaryKeySelective(@PathVariable Integer readerId,@RequestBody reader_info re){
              re.setReaderId(readerId);
              int i = reader.updateByPrimaryKeySelective(re);
                    System.out.println(re);
              if(i==1){
                  return JSON.toJSONString("success");
              }else {
                  return JSON.toJSONString("fail");
              }
          }



}
