import com.yunfan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/15:30
 * @Description: ScopesTest
 */
public class ScopesTest {


    @Test
    public void singletonTest() {
        //单例模式(默认机制)  每个bean只会创建一个 bean的hash值永远是相同的  单线程使用singleton
        ApplicationContext context = new ClassPathXmlApplicationContext("scopesbeans.xml");
        User user1 = (User) context.getBean("singletonUser");
        User user2 = (User) context.getBean("singletonUser");
        //true
        System.out.println(user1 == user2);
    }


    @Test
    public void prototypeTest(){
        //原型模式 每次从容器中get的时候都会产生一个新对象 所以hash值不同   多线程使用prototype
        ApplicationContext context = new ClassPathXmlApplicationContext("scopesbeans.xml");
        User user1 = (User) context.getBean("prototypeUser");
        User user2 = (User) context.getBean("prototypeUser");
        //false
        System.out.println(user1 == user2);
    }
}
