import com.yunfan.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : lixuan
 * @date : 2021/03/27/18:19
 * @description: AopTest
 */
public class AopTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理 代理的是接口，不是impl实现类
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
