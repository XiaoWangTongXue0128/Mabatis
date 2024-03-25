package domain;

import java.util.List;

public class Teacher {
    private Integer tid;
    private String tname;
    private String tsex;
    private Integer tage;
    private List<Teacher> student;

    public Teacher() {
    }

    public Teacher(Integer tid, String tname, String tsex, Integer tage, List<Teacher> student) {
        this.tid = tid;
        this.tname = tname;
        this.tsex = tsex;
        this.tage = tage;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tage=" + tage +
                ", student=" + student +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public List<Teacher> getStudent() {
        return student;
    }

    public void setStudent(List<Teacher> student) {
        this.student = student;
    }
}
