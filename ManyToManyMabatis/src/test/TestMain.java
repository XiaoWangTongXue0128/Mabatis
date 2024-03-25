package test;

import domain.Student;
import domain.Teacher;
import service.StudentService;
import service.TeacherService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {

        TeacherService teacherService = new TeacherService();
//        Teacher teacher = teacherService.selectOne(1);
//        System.out.println(teacher);
//        List<Teacher> teacherList = teacherService.selectAll();
//        for (Teacher teacher : teacherList) {
//            System.out.println(teacher);
//
//        }
        StudentService studentService = new StudentService();
        Student student = studentService.selectOne(1);
        System.out.println(student);
        /*

        List<Student> students = studentService.selectOneOrMore(map);
        for (Student student : students) {
            System.out.println(student);

        }

         */
        /*
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ssex", "女");
        map.put("sname","赵一");
        map.put("sid", 1);
        studentService.update(map);

         */
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        List<Student> studentList = studentService.selectList(list);
//        for (Student student : studentList) {
//            System.out.println(student);
//
//        }
    }
}
