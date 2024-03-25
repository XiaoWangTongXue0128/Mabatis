package domain;

//员工
public class Emp {
    private Integer empno;
    private String ename;
    private String sal;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer empno, String ename, String sal, Dept dept) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.dept = dept;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal='" + sal + '\'' +
                ", dept=" + dept +
                '}';
    }
}
