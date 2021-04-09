import com.yunfan.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/15:54
 * @Description: 自动装配
 */
public class AutowiredTest {

    @Test
    public void showTest() {
        // 显示配置
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("showPeople", People.class);
        people.getCat().sound();
        people.getDog().sound();
    }

    @Test
    public void xmlAutowired(){
        //xml自动配置
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //byName 需要保证所有bean的id唯一，并且这个bean需要和自动注入的属性的set方法值是一致的
        People byName = context.getBean("byName", People.class);
        byName.getCat().sound();
        byName.getDog().sound();
        //byType 需要保证所有bean的class唯一，并且这个bean需要和自动注入的类型一致
        People byType = context.getBean("byType", People.class);
        byType.getCat().sound();
        byType.getDog().sound();
    }


    @Test
    public void annotationAutowired(){
        //注解自动配置
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredbeans.xml");
        People people = context.getBean("autowiredPeople", People.class);
        people.getAutowiredCat().sound();
        people.getAutowiredDog().sound();
    }
}
