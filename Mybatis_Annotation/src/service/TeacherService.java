package service;

import dao.TeacherDao;
import domain.Teacher;
import util.MySpring;

import java.util.List;

public class TeacherService {

    private TeacherDao dao = MySpring.getSqlSession(true).getMapper(TeacherDao.class);
    public Teacher selectOne(Integer tid) {
        return dao.selectOne(tid);
    }
    public List<Teacher> selectAll() {

        return dao.selectAll();
    }
}
