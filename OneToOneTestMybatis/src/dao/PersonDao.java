package dao;

import domain.Person;
import org.apache.ibatis.session.SqlSession;
import util.MyUtil;

import java.util.List;

public class PersonDao {
    private SqlSession sqlSession = MyUtil.getSqlSession(true);
    //根据pid查询人+身份证信息
    public Person selectOne(Integer pid) {
        return sqlSession.selectOne("selectOne", pid);
    }

    public List<Person> selectAll() {
        return sqlSession.selectList("selectAll");
    }
}
