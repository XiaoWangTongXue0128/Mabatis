package dao;

import domain.Dept;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;

public class DeptDao {
    private SqlSession sqlSession = MySpring.getSqlSession(true);

    public Dept selectOne(Integer deptno) {
        return sqlSession.selectOne("selectOne", deptno);
    }
    public List<Dept> selectAll() {
        return sqlSession.selectList("selectAll");
    }
}
