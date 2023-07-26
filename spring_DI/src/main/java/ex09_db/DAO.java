package ex09_db;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// DAO는 보통 repository로 불러옴
@Repository("dao")
public class DAO {
	// 실제 사용할 클래스 : SqlSessionTemplate
	// 
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<VO> getList(){
		// 오류
		List<VO> list = sqlSessionTemplate.selectList("members.list");
		return list;
	}
}