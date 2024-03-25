package service;

import dao.EmpDao;
import domain.Emp;
import util.MySpring;

import java.util.List;

public class EmpService {
    private EmpDao dao = MySpring.getBean("dao.EmpDao");

    public Emp selectOne(Integer empno) {
        return dao.selectOne(empno);
    }

    public List<Emp> selectAll() {
        return dao.selectAll();
    }

}
