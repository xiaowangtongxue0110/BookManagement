package gentleman.dao;

import gentleman.bean.reader_info;
import gentleman.bean.reader_infoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface reader_infoMapper {

    long countByExample();

    int deleteByExample(reader_infoExample example);

    int deleteByPrimaryKey(@Param("readerId") Integer readerId);

    int insert(reader_info record);

    int insertSelective(reader_info record);

    List<reader_info> selectByExample(reader_infoExample example);

    reader_info selectByPrimaryKey(Integer readerId);

    int updateByExampleSelective(@Param("record") reader_info record, @Param("example") reader_infoExample example);

    int updateByExample(@Param("record") reader_info record, @Param("example") reader_infoExample example);


    int updateByPrimaryKeySelective(reader_info record);

    int updateByPrimaryKey(reader_info record);

    List<reader_info> selectAllreader_info();

}