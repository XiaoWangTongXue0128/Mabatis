package service;

import dao.DeptDao;
import domain.Dept;
import util.MySpring;

import java.util.List;

public class DeptService {
    private DeptDao dao = MySpring.getBean("dao.DeptDao");

    public Dept selectOne(Integer deptno) {
        return dao.selectOne(deptno);
    }
    public List<Dept> selectAll() {
        return dao.selectAll();
    }

}
