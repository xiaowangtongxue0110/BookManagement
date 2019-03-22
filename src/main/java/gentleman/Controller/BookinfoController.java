package gentleman.Controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import gentleman.bean.Book_info;
import gentleman.service.Bookinfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookinfoController {

       @Autowired
       private Bookinfoservice bookMapper;



       @GetMapping("/book")
       public String selectAllBook_info(int currentPage, int pageSize){
           PageHelper.startPage(currentPage,pageSize);
           List<Book_info> books = bookMapper.selectAllBook_info(currentPage,pageSize);

           PageInfo<Book_info> book_count = new PageInfo<>(books);
           int sum = (int) book_count.getTotal();
           HashMap<String, Object> map = new HashMap<>();
              map.put("sum",sum);
              map.put("books",books);
           return JSON.toJSONString(map);
       }

       @PostMapping("/book")
      public String insert(@RequestBody Book_info record){
           int insert = bookMapper.insert(record);
             if(insert==1){
                 return JSON.toJSONString("success");
             }else {
                 return JSON.toJSONString("fail");
             }
       }

       @GetMapping("/books/{bookid}")
    public String selectById(@PathVariable Long bookid){
           List<Book_info> books = bookMapper.selectByPrimaryKey(bookid);
           PageInfo<Book_info> index = new PageInfo<>(books);
           Map<String, Object> map = new HashMap<>();
           map.put("book_count",index.getTotal());
           map.put("book_list",books);
           if(books.size()!=0){
                return JSON.toJSONString(map);
           }else {
               return JSON.toJSONString("fail");
           }
       }
}
