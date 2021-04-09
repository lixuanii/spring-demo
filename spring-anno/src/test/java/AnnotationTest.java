import com.yunfan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/10:32
 * @Description: 注解 自动装备测试
 */
public class AnnotationTest {


    @Test
    public void annotationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }


    /**
     * 开启注解的支持
     * <context:annotation-config/>
     * 指定要扫描的包，这个包下面的注解就会生效
     * <context:component-scan base-package="com.yunfan.pojo"/>
     *
     *  @Component 被spring管理  等同于 <bean id="user" class="com.yunfan.pojo.User"/>  放在类上面，说明这个类被spring管理了
     * 	这些都等同于 @Component 意思都是将类注册的spring容器中让spring去管理
     * 	    dao 层 @Repository
     * 		service 层 @Service
     * 		controller 层 @Controlller
     *
     *  @Autowired 自动装配
     *
     *  @Value("小明") 属性注入 等同于 <property name="name" value="小明"/>
     *
     *  @Scope("singleton") 作用域
     */

}
