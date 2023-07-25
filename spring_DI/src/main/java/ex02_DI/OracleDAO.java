package ex02_DI;

import org.springframework.stereotype.Component;

// 오라클의 id가 "dao"가 된 것! 이런 식으로 넣을 수 있다.
// id를 안 쓰면 클래스 이름의 소문자를 사용??
@Component("dao")
public class OracleDAO implements DAO {
	public OracleDAO() {
		System.out.println("오라클 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("오라클 메서드");
	}
}
