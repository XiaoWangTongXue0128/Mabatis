package dao;

import domain.Student;
import domain.Teacher;
import dynamic.StudentDynamic;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    @Results(
            id = "selectStudent",
            value = {
                    @Result(id = true,property = "sid",column = "sid"),
                    @Result(property = "sname",column = "sname"),
                    @Result(property = "ssex",column = "ssex"),
                    @Result(property = "sage",column = "sage"),
                    @Result(property = "teacher",column = "sid",javaType = List.class,
                            many = @Many(select = "selectTeaherForSid",fetchType = FetchType.LAZY))
            }
    )
    @Select("select sid,sname,ssex,sage from student where sid=#{sid}")
    public Student selectOne(Integer sid);

    @Select("select t.tid,t.tname,t.tsex,t.tage from tea_stu ts inner join teacher t on t.tid = ts.tid where ts.sid=#{sid}")
    public Teacher selectTeaherForSid(Integer sid);

    @Select("select sid,sname,ssex,sage from student")
    @ResultMap("selectStudent")
    public List<Student> selectAll();


    @SelectProvider(type = StudentDynamic.class,method = "selectOneOrMore")
    @ResultMap("selectStudent")
    public List<Student> selectOneOrMore(@Param("ssex") String ssex, @Param("sname") String sname, @Param("sage") Integer sage);

    @UpdateProvider(type = StudentDynamic.class,method = "StudentUpdateSql")
    public void update(@Param("sid") Integer sid, @Param("ssex") String ssex, @Param("sname") String sname);

    @SelectProvider(type = StudentDynamic.class,method = "selectList")
    @ResultMap("selectStudent")
    public List<Student> selectList(List<Integer> list);
}
