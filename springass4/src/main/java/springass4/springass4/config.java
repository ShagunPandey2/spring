package springass4.springass4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages="springass4.springass4")
@EnableAspectJAutoProxy
public class config {
	
	@Bean
	public triangle tr() {
		return new triangle("Equilateral", 5, 5, 5);
	}
	@Bean
	public triangle tr1() {
		return new triangle("Isosceles", 5, 3, 5);
	}
	@Bean
	public triangle tr2() {
		return new triangle("Scalene", 5, 3, 2);
	}
	@Bean
	public triangle tr3() {
		return new triangle("RightAngled", 3, 4, 5);
	}
	
	@Bean
	public frame al() {
		return new frame();
	}
}