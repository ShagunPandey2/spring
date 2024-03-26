package springass4.springass4;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new  AnnotationConfigApplicationContext(config.class);
    	triangle t=(triangle) context.getBean("tr");
    	triangle t1=(triangle) context.getBean("tr1");
    	triangle t2=(triangle) context.getBean("tr2");
    	triangle t3=(triangle) context.getBean("tr3");
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}