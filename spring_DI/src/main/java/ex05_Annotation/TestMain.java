package ex05_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("ex05_Annotation/config.xml");
		
		// 아래 sic처럼 id가 없으면 nullPointerException 나온다!!
		Service service = (Service) context.getBean("sic");
		service.biz();
	}
}
