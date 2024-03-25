package dao;

import domain.Student;
import domain.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSession;
import util.MySpring;

import java.util.List;

public interface TeacherDao {
    @Results(
            id = "selectTeacher",
            value = {
                    @Result(id = true,property = "tid",column = "tid"),
                    @Result(property = "tname",column = "tname"),
                    @Result(property = "tsex",column = "tsex"),
                    @Result(property = "tage",column = "tage"),
                    @Result(property = "student",column = "tid",javaType = List.class,many = @Many(select = "selectStudentFortid"))
            }
    )
    @Select("select tid,tname,tsex,tage from teacher where tid = #{tid}")
    public Teacher selectOne(Integer tid);

    @Select("select ts.*,s.* from tea_stu ts inner join student s on ts.sid = s.sid where ts.tid = #{tid}")
    public Student selectStudentFortid(Integer tid);

    @Select("select tid,tname,tsex,tage from teacher")
    @ResultMap("selectTeacher")
    public List<Teacher> selectAll();
}
