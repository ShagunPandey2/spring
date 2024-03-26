package springass.springassin1;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext cnt=new ClassPathXmlApplicationContext("springass/springassin1/config.xml");
		     Emp emp1=(Emp) cnt.getBean("myClassBean");
		     System.out.println("the following are the course durations for the batch:");
		     System.out.println(emp1.getCourses());
	}
}