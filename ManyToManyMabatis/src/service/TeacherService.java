package service;

import dao.StudentDao;
import dao.TeacherDao;
import domain.Student;
import domain.Teacher;

import java.util.List;

public class TeacherService {

    private TeacherDao dao = new TeacherDao();
    public Teacher selectOne(Integer tid) {
        return dao.selectOne(tid);
    }
    public List<Teacher> selectAll() {

        return dao.selectAll();
    }
}
