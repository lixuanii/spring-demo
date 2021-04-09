import com.yunfan.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : lixuan
 * @Date : 2021/03/25/17:24
 * @Description: HelloTest
 */
public class HelloTest {

    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //将对象bean都放到spring中去管理，需要使用就直接去拿
        Hello hello = (Hello) applicationContext.getBean("Hello");
        System.out.println(hello.toString());

        /**
         * 原来  Hello hello = new Hello();
         * 现在  <bean id="Hello" class="com.yunfan.pojo.Hello">
         *         <property name="name" value="String"/>
         *      </bean>
         *
         * 把new对象的事情交给spring容器去创建
         *
         * 控制：谁来控制对象的创建，传统应用是由程序本身创建的 Hello hello = new Hello();
         *      使用spring之后，对象是由spring创建  xml配置bean
         * 反转：程序本身不是创建对象，而是被动的接收对象
         * 依赖注入：就是利用set方法进行注入
         * IOC是一种编程思想，由主动编程变成被动接收
         *
         * IOC：对象由spring来创建、管理、装配
         *
         */
    }
}
