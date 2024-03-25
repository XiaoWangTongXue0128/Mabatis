package dao;

import domain.IDCard;
import org.apache.ibatis.session.SqlSession;
import util.MyUtil;

import java.util.List;

public class IDCardDao {
    private SqlSession sqlSession = MyUtil.getSqlSession(true);
    public IDCard selectOne(String id) {
        return sqlSession.selectOne("selectOne",id);
    }

    public List<IDCard> selectAll() {
        return sqlSession.selectList("selectAll");
    }
}
