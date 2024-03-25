package dao;

import domain.Emp;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;

public class EmpDao {
    private SqlSession sqlSession = MySpring.getSqlSession(true);

    public Emp selectOne(Integer empno) {
        return sqlSession.selectOne("selectOne", empno);
    }

    public List<Emp> selectAll() {
        return sqlSession.selectList("selectAll");
    }
}
