import com.yunfan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/10:48
 * @Description: bean的别名
 */
public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        //bean的别名标签
        //User user = (User) applicationContext.getBean("userAlias");
        //bean的bean标签
        //User userBean = (User) applicationContext.getBean("userName");
        //bean的import标签


    }
}
