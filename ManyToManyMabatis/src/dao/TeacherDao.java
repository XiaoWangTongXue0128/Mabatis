package dao;

import domain.Student;
import domain.Teacher;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;

public class TeacherDao {
    private SqlSession sqlSession = MySpring.getSqlSession(true);
    public Teacher selectOne(Integer tid) {
        return sqlSession.selectOne("selectOne", tid);
    }
    public List<Teacher> selectAll() {
        return sqlSession.selectList("selectAll");
    }
}
