import com.yunfan.dao.impl.UserDaoImpl;
import com.yunfan.dao.impl.UserMysqlDaoImpl;
import com.yunfan.pojo.User;
import com.yunfan.service.UserService;
import com.yunfan.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/25/16:13
 * @Description: set注入 SetUserTest
 */
public class SetUserTest {

    public static void main(String[] args) {
        /**
         * 在业务中，用户的需求会影响原来的代码，我们需要根据用户需求去修改源代码
         * 之前，程序是主动创建对象的，UserDao userDao = new UserDaoImpl();
         * 现在使用了set注入后 程序不再具有主动性，而是变成了被动的接受对象。 userService.setUserDao(new UserDaoImpl())
         * 只需要你去实现 UserDao 即可拿到任何的对象
         * 这就是控制反转，从本质上解决了问题，我们不用再去管理程序的创建，系统耦合性大大降低，可以更加专注在业务的实现上
         */


//        UserService userService = new UserServiceImpl();
//        //利用set注入，将实现值丢入set方法中。
//        userService.setUserDao(new UserMysqlDaoImpl());
//        userService.getUser();
//
//        userService.setUserDao(new UserDaoImpl());
//        userService.getUser();


        //spring创建对象的过程
        //1.spring获取上下文 ApplicationContext  获取spring容器,所有bean都在这里
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //2.获取bean
        UserServiceImpl mysql = (UserServiceImpl) applicationContext.getBean("mysql-UserServiceImpl");
        mysql.getUser();

        UserServiceImpl dao = (UserServiceImpl) applicationContext.getBean("dao-UserServiceImpl");
        dao.getUser();

    }
}
