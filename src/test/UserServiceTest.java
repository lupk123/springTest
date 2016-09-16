package test;

import com.spring.model.Log;
import com.spring.model.User;
import com.spring.service.UserService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2016/8/10.
 */
public class UserServiceTest {
    @Test
    public void add() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserService)applicationContext.getBean("userService");

        User u = new User();
        u.setUsernmae("a");
        u.setPassword("a");
        Log log = new Log();
        log.setState("ccc");
        userService.add(u, log);

    }

}