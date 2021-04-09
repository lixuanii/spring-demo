import com.yunfan.config.UserConfig;
import com.yunfan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/11:24
 * @Description: 配置测试
 */
public class ConfigTest {

    public static void main(String[] args) {
        //完全使用配置类的方式去做，获取spring上下文，通过配置类的class对象的加载
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean("getUser",User.class);
        System.out.println(user.getName());
    }
}
