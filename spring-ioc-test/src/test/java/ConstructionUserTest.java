import com.yunfan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/10:20
 * @Description: 构造器注入
 */
public class ConstructionUserTest {

    public static void main(String[] args) {
        /**
         * IOC创建对象的方式
         * 1.默认  无参构造
         * 2. 有参构造
         *      下标赋值
         *      参数类型匹配
         *      直接通过参数名来设置
         *
         * 总结：在配置文件加载的时候，容器中管理的对象就已经初始化了
         */
        //这一步的时候就已经拿到了所有bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) applicationContext.getBean("user");
//        user.show();



    }
}
