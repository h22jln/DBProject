package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApiDao {
	protected static final String NAMESPACE = "myproject.";

	@Autowired
	private SqlSession sqlSession;

	public List<Map<String, Object>> selectName(String subject){
		List<Map<String, Object>> result = sqlSession.selectList(NAMESPACE + "selectName",subject);
		return result;
	}
	
	public int selectNum(String subject) {
		int result = sqlSession.selectOne(NAMESPACE + "selectCount",subject);
		return result;
	}

}
