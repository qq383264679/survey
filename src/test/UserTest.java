package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feng.model.User;
import com.feng.service.UserService;

public class UserTest {
	private static UserService userService; 
	@BeforeClass
	public static void first() {
		String[] beans = {"dbContext.xml", "applicationContext.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(beans);
		System.out.println(ctx);
		userService = (UserService) ctx.getBean("userService");
	}
	@Test
	public void second() {
		System.out.println(userService);
		User u = new User();
		u.setEmail("383264@ss.com");
		u.setName("fengchao ");
		u.setNickName("¹þà¶1111111");
		userService.saveEntity(u);
	
	}
}
