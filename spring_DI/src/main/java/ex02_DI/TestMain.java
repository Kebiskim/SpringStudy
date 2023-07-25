package ex02_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// Spring Container에서 객체(Bean)을 생성하고 관리한다.
		// Container가 객체를 생성하고 관리할 수 있도록 설정 정보를 만들어야 한다.
		
		// String Container => BeanFactory => ApplicationContext 	(java)
		//								   => WebApplicationContext (Web)
		
		// 해당 컨테이너가 설정정보를 읽어서 객체를 관리하고 의존성 주입을 할 수 있다.
		ApplicationContext context =
				new GenericXmlApplicationContext("ex02_DI/config.xml");
		
		// Service에 있는 biz() 실행
		// ex02_DI/config.xml에 만들어진 객체 호출
		// ID로 호출하기 => 그래서 getBean의 파라미터가 String
		// 소문자로 들어가면 된다 (config에 있는 그대로)
		
		// getBean을 호출함을 통해 인스턴스가 생성되고, 스프링 컨테이너의 Singleton으로 등록이 된다.
		Service service = (Service) context.getBean("service");
		Service service2 = (Service) context.getBean("service");
		service.biz();
		service2.biz();
	}
}
