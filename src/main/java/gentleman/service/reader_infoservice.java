package gentleman.service;

import gentleman.bean.reader_info;
import gentleman.bean.reader_infoExample;
import gentleman.util.PageResult;
import gentleman.util.PageUtil;

import java.util.List;

public interface reader_infoservice {

    List<reader_info> selectAllreader_info(int currentPage, int pageSize);

    int insertSelective(reader_info record);

    int deleteByPrimaryKey(Integer readerId);

    long countByExample();


}
