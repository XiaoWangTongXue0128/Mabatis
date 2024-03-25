package dao;

import domain.Student;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;
import java.util.Map;

public class StudentDao {
    private SqlSession sqlSession = MySpring.getSqlSession(true);
    public Student selectOne(Integer sid) {
        return sqlSession.selectOne("selectOne",sid);
    }
    public List<Student> selectAll() {
        return sqlSession.selectList("selectAll");
    }

    public List<Student> selectOneOrMore(Map<String,Object> map) {

        return sqlSession.selectList("selectOneOrMore", map);
    }

    public void update(Map<String,Object> map) {
        sqlSession.update("update", map);
    }

    public List<Student> selectList(List<Integer> list) {
        return sqlSession.selectList("selectList", list);
    }
}
