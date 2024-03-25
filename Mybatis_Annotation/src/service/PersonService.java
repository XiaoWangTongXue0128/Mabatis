package service;

import dao.PersonDao;
import domain.Person;
import org.apache.ibatis.annotations.Param;
import util.MyUtil;

import java.util.List;

public class PersonService {
    //动态代理
    private PersonDao dao = MyUtil.getSqlSession(true).getMapper(PersonDao.class);

    public Person selectOne(Integer pid) {
        return dao.selectOne(pid);
    }

    public List<Person> selectAll() {
        return dao.selectAll();
    }

    public void insert(@Param("pid") Integer pid, @Param("pname") String pname, @Param("cardid")String cardid) {
        dao.insert(pid, pname, cardid);
    }
}
