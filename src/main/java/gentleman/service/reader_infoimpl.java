package gentleman.service;

import gentleman.bean.reader_info;
import gentleman.dao.reader_infoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reader_infoimpl implements reader_infoservice {

    @Autowired
    private reader_infoMapper reader;


    @Override
    public List<reader_info> selectAllreader_info(int currentPage, int pageSize) {
        return reader.selectAllreader_info();
    }

    @Override
    public int insertSelective(reader_info record) {
        return reader.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer readerId) {
        return reader.deleteByPrimaryKey(readerId);
    }


    @Override
    public reader_info selectByPrimaryKey( Integer readerId) {
        return reader.selectByPrimaryKey(readerId);
    }

    @Override
    public int updateByPrimaryKeySelective(reader_info record) {
        return reader.updateByPrimaryKeySelective(record);
    }

}
