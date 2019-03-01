package gentleman.service;

import gentleman.bean.Book_info;
import gentleman.dao.Book_infoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bookinfoserviceimpl implements Bookinfoservice {
    @Autowired
    private Book_infoMapper bookInfoMapper;

    @Override
    public List<Book_info> selectAllBook_info(int currentPage, int pageSize) {
        List<Book_info> book = bookInfoMapper.selectAllBook_info();
        return book;
    }

    @Override
    public int insert(Book_info record) {
        return bookInfoMapper.insertSelective(record);
    }

    @Override
    public List<Book_info> selectByPrimaryKey(Long bookId) {
        return bookInfoMapper.selectByPrimaryKey(bookId);
    }

}
