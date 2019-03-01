package gentleman.service;

import gentleman.bean.Book_info;

import java.util.List;

public interface Bookinfoservice {

    List<Book_info> selectAllBook_info(int currentPage, int pageSize);

    int insert(Book_info record);

    List<Book_info> selectByPrimaryKey(Long bookId);

}
