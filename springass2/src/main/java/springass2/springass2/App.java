package springass2.springass2;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("springass2/springass2/spring.xml");
        draw obj1 = (draw) context.getBean("draw");
        System.out.println(obj1);
    }
}