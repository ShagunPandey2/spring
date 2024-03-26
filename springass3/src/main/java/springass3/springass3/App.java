package springass3.springass3;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("springass3/springass3/config.xml");
		triangle infomation = (triangle) context.getBean("triangle");			
		System.out.println(infomation);
	}
}