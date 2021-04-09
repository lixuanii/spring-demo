import com.yunfan.pojo.Student;
import com.yunfan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/13:46
 * @Description: MyTest
 */
public class DiTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }


    @Test
    public void namespace(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User userP = (User) context.getBean("user:p");
        User userC = (User) context.getBean("user:c");
    }

    /**
     * DI依赖注入
     * set注入、构造器注入、拓展注入
     * set <property name="name" value="小明"/> <property name="address" ref="address"/>
     * 构造器(无参注入就是默认的注入)  <constructor-arg name="name" value="3.有参注入 直接通过参数名来设置"/> <constructor-arg index="0" value="1.有参注入 通过index下标赋值"/>
     * 拓展 p标签 c标签 <bean id="user:p" class="com.yunfan.pojo.User" p:name="小黄" p:age="12"/> <bean id="user:c" class="com.yunfan.pojo.User" c:age="18" c:name="小明"/>
     */
}
