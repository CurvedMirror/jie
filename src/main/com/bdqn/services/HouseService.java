package bdqn.services;

import org.springframework.stereotype.Service;

/**
 * @author jie
 * @date 2019/2/3 -21:54
 */

public interface HouseService {
    int deleteByPrimaryKey(Integer id);

    int insert(com.bdqn.model.House record);

    int insertSelective(com.bdqn.model.House record);

    com.bdqn.model.House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(com.bdqn.model.House record);

    int updateByPrimaryKey(com.bdqn.model.House record);
}
