package gentleman.dao;

import gentleman.bean.Book_info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Book_infoMapper {

    int deleteByPrimaryKey(Long bookId);

    int insert(Book_info record);

    int insertSelective(Book_info record);

    List<Book_info> selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(Book_info record);

    int updateByPrimaryKeyWithBLOBs(Book_info record);

    int updateByPrimaryKey(Book_info record);

    List<Book_info> selectAllBook_info();



}