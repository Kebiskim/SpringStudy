package ex05_Annotation;

import org.springframework.stereotype.Service;

@Service
public class OracleDAO implements DAO {
	public OracleDAO() {
		System.out.println("오라클 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("오라클 메서드");
	}
}
