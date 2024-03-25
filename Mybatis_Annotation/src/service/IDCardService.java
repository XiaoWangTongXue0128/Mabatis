package service;

import dao.IDCardDao;
import domain.IDCard;
import org.apache.ibatis.annotations.Select;
import util.MyUtil;

import java.util.List;

public class IDCardService {
    //动态代理
    private IDCardDao dao = MyUtil.getSqlSession(true).getMapper(IDCardDao.class);


    public IDCard selectOne(String id) {
        return dao.selectOne(id);
    }
    public List<IDCard> selectAll() {
        return dao.selectAll();
    }
}
