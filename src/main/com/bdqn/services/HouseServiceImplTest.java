package bdqn.services;

import com.bdqn.model.House;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author jie
 * @date 2019/2/3 -22:02
 */
public class HouseServiceImplTest {

    @org.junit.Test
    public void selectByPrimaryKey() {
        HouseService houseService = new HouseServiceImpl();
        House house = houseService.selectByPrimaryKey(1);
        System.out.println(house);
    }
}
