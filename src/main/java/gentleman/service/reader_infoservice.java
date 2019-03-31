package gentleman.service;

import gentleman.bean.reader_info;

import java.util.List;

public interface reader_infoservice {

    List<reader_info> selectAllreader_info(int currentPage, int pageSize);

    int insertSelective(reader_info record);

    int deleteByPrimaryKey(Integer readerId);

    reader_info selectByPrimaryKey(Integer readerId);

    int updateByPrimaryKeySelective(reader_info record);


}
