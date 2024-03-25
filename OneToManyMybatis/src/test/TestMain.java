package test;

import domain.Dept;
import domain.Emp;
import service.DeptService;
import service.EmpService;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        /*
        EmpService service = new EmpService();
        Emp emp = service.selectOne(7499);
        System.out.println(emp);
        List<Emp> empList = service.selectAll();
        for (Emp emp : empList) {
            System.out.println(emp);
        }
         */

        DeptService service = new DeptService();
        /*
        Dept dept = service.selectOne(20);
        System.out.println(dept);
         */

        List<Dept> deptList = service.selectAll();
        for (Dept dept : deptList) {
            System.out.println(dept);
        }


    }
}
