package gentleman.service;

import gentleman.bean.reader_info;
import gentleman.dao.reader_infoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reader_infoimpl implements reader_infoservice {

    @Autowired
    private reader_infoMapper reader;

    @Override
    public List<reader_info> selectAllreader_info() {
        return reader.selectAllreader_info();
    }

    @Override
    public int insertSelective(reader_info record) {
        return reader.insertSelective(record);
    }

}
