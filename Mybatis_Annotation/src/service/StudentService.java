package service;

import dao.StudentDao;
import domain.Student;
import org.apache.ibatis.annotations.Param;
import util.MySpring;

import java.util.List;
import java.util.Map;

public class StudentService {
    private StudentDao dao = MySpring.getSqlSession(true).getMapper(StudentDao.class);


    public Student selectOne(Integer sid) {
        return dao.selectOne(sid);
    }
    public List<Student> selectAll() {
        return dao.selectAll();
    }

    public List<Student> selectOneOrMore(String ssex, String sname, Integer sage) {

        return dao.selectOneOrMore(ssex,sname,sage);
    }

    public void update(Integer sid,String ssex,String sname) {
        dao.update(sid,ssex,sname);
    }
    //<foreach> -->  SQL中添加in( , , )
    public List<Student> selectList(List<Integer> list) {
        return dao.selectList( list);
    }

}
