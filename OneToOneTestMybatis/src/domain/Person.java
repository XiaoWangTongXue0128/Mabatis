package domain;

public class Person {
    //自有属性
    private Integer pid;
    private String pname;
    //关联属性
    private IDCard cardid;

    public Person() {
    }

    public Person(Integer pid, String pname, IDCard cardid) {
        this.pid = pid;
        this.pname = pname;
        this.cardid = cardid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public IDCard getCardid() {
        return cardid;
    }

    public void setCardid(IDCard cardid) {
        this.cardid = cardid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cardid=" + cardid +
                '}';
    }
}
