package dao;

import domain.Dept;
import domain.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;

public interface EmpDao {

    @Results(
            id = "selectEmp",
            value = {
                    @Result(id = true, property = "empno", column = "empno"),
                    @Result(property = "ename",column = "ename"),
                    @Result(property = "sal",column = "sal"),
                    @Result(property = "dept",javaType = Dept.class,column = "deptno",one = @One(select = "selectDept"))
            }
    )
    @Select("select empno,ename,sal,deptno from emp where empno=#{empno}")
    public Emp selectOne(Integer empno);

    @Select("select dname,loc from dept where deptno=#{deptno}")
    public Dept selectDept(Integer deptno);

    @ResultMap("selectEmp")
    @Select("select empno,ename,sal,deptno from emp")
    public List<Emp> selectAll();
}
