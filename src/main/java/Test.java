import com.example.dao.Acount;
import com.example.dao.OrderMap;
import com.example.dao.UserMap;
import com.example.domain.Order;
import com.example.domain.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/22 16:20
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream resouce = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sqlSession
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resouce);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        List<Acount> acountList = sqlSession.selectList("userMapper.selectAccout");
        System.out.println(acountList);
//        Acount acount = new Acount();
//        acount.setUsername("test3");
//        acount.setMoney(1000);
//        acount.setDate(new Date());
//        UserMap userMap= sqlSession.getMapper(UserMap.class); // 使用代理方式
//        //分页
//        PageHelper.startPage(1,3);
////        List<Acount> acountList =  userMap.getAccountById(acount);
//        PageInfo<Acount> pageInfo = new PageInfo<Acount>(acountList);
//        System.out.println(acountList);
//          // 测试insert
//         userMap= sqlSession.getMapper(UserMap.class); // 使用代理方式
//         userMap.saveAccount(acount);
           OrderMap orderMap= sqlSession.getMapper(OrderMap.class); // 使用代理方式
           List<Order> orderList = orderMap.queryOrderList();
           System.out.println(orderList);

           //
         orderMap= sqlSession.getMapper(OrderMap.class); // 使用代理方式
        List<User> userList = orderMap.queryAll();
        System.out.println(userList);

        UserMap userMap= sqlSession.getMapper(UserMap.class); // 使用代理方式
        List<User> userList1 = userMap.queryUserAndRole();
        System.out.println(userList1);
    }


}
