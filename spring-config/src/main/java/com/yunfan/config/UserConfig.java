package com.yunfan.config;

import com.yunfan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : lixuan
 * @Date : 2021/03/27/11:13
 * @Description: user配置类
 */
//本质是一个@Component
//@Configuration代表这是一个配置类，和之前的bean.xml一致
@Configuration
@Import(UserConfig2.class)//引入其他的配置类  跟bean.xml里面的 <import>标签一致
public class UserConfig {

    /**
     * 注册一个bean  方法名 == bean标签中的id     返回值 == bean标签中的class属性
     *
     * @return
     */
    @Bean
    public User getUser() {
        /**
         * 要注入的bean的对象
         */
        return new User();
    }
}
