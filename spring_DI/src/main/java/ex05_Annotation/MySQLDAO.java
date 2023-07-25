package ex05_Annotation;

import org.springframework.stereotype.Component;

// 아래 어노테이션 => <bean id="oracleDAO" class="ex02_DI.OracleDAO" /> 과 같은 효과!
// 어노테이션은 같은 패키지 내에서만 적용??

@Component("dao")
public class MySQLDAO implements DAO {
	public MySQLDAO() {
		System.out.println("MySQL  생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("MySQL 메서드");
	}
}