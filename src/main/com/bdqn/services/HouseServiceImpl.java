package bdqn.services;

import com.bdqn.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jie
 * @date 2019/2/3 -21:57
 */
@Service("HouseService")
public class HouseServiceImpl implements HouseService {

    @Autowired
    private com.bdqn.dao.HouseMapper houseMapper ;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(House record) {
        return 0;
    }

    public int insertSelective(House record) {
        return 0;
    }

    public House selectByPrimaryKey(Integer id) {
        return houseMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(House record) {
        return 0;
    }

    public int updateByPrimaryKey(House record) {
        return 0;
    }
}
