package test;

import domain.*;
import service.*;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        /*

        PersonService service = new PersonService();
//        Person person = service.selectOne(1);
//        System.out.println(person);
        List<Person> personList = service.selectAll();
        for (Person person : personList) {
            System.out.println(person);
        }
//        service.insert(4,"李四","110000200001010104");

         */
        //-----------------------------------------
        /*
        IDCardService service = new IDCardService();
//        IDCard idCard = service.selectOne("110000200001010101");
//        System.out.println(idCard);

        List<IDCard> cardList = service.selectAll();
        for (IDCard card : cardList) {
//            System.out.println(card.getCardid()+"+"+card.getAddress());
            System.out.println(card);
        }

         */
//------------------------------------------------------------------

//        EmpService service = new EmpService();
//        Emp emp = service.selectOne(7499);
//        System.out.println(emp);
//        List<Emp> empList = service.selectAll();
//        for (Emp emp : empList) {
//            System.out.println(emp);
//        }


//        DeptService service = new DeptService();

//        Dept dept = service.selectOne(30);
//        System.out.println(dept);


//        List<Dept> deptList = service.selectAll();
//        for (Dept dept : deptList) {
//            System.out.println(dept);
//        }

        //------------------------------------------------

//        TeacherService teacherService = new TeacherService();
////        Teacher teacher = teacherService.selectOne(1);
////        System.out.println(teacher);
//        List<Teacher> teacherList = teacherService.selectAll();
//        for (Teacher teacher : teacherList) {
//            System.out.println(teacher);
//
//        }
        StudentService studentService = new StudentService();
//        Student student = studentService.selectOne(1);
//        System.out.println(student);
//        List<Student> students = studentService.selectAll();
//        for (Student student : students) {
//            System.out.println(student);
//        }

//        List<Student> students = studentService.selectOneOrMore("男","郑",null);
//        for (Student student : students) {
//            System.out.println(student);
//
//        }



//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("ssex", "女");
//        map.put("sname","赵一");
//        map.put("sid", 1);
//        studentService.update(null,"女","赵一");


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Student> studentList = studentService.selectList(list);
        for (Student student : studentList) {
            System.out.println(student);

        }

    }
}
