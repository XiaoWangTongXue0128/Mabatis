package service;

import dao.StudentDao;
import domain.Student;

import java.util.List;
import java.util.Map;

public class StudentService {
    private StudentDao dao = new StudentDao();
    public Student selectOne(Integer sid) {
        return dao.selectOne(sid);
    }
    public List<Student> selectAll() {
        return dao.selectAll();
    }
    public List<Student> selectOneOrMore(Map<String,Object> map) {

        return dao.selectOneOrMore(map);
    }

    public void update(Map<String,Object> map) {
        dao.update( map);
    }
    //<foreach> -->  SQL中添加in( , , )
    public List<Student> selectList(List<Integer> list) {
        return dao.selectList( list);
    }
}
