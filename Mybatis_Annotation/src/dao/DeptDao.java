package dao;

import domain.Dept;
import domain.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;

public interface DeptDao {

    @Results(
            id = "selectDept",
            value = {
                    @Result(id = true, property = "deptno", column = "deptno"),
                    @Result(property = "dname", column = "dname"),
                    @Result(property = "loc", column = "loc"),
                    @Result(property = "empList", column = "deptno", javaType = List.class,many =@Many(select = "selectEmp") )
            }
    )
    @Select("select deptno,dname,loc from dept where deptno=#{deptno}")
    public Dept selectOne(Integer deptno);

    @Select("select empno,ename,sal from emp where deptno=#{deptno}")
    public Emp selectEmp(Integer deptno);

    @Select("select deptno,dname,loc from dept")
    @ResultMap("selectDept")
    public List<Dept> selectAll();
}
