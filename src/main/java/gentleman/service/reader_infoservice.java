package gentleman.service;

import gentleman.bean.reader_info;

import java.util.List;

public interface reader_infoservice {

    List<reader_info> selectAllreader_info();

    int insertSelective(reader_info record);


}
