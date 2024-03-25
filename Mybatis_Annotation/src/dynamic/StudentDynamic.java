package dynamic;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public class StudentDynamic {
    public String StudentUpdateSql(@Param("sid") Integer sid, @Param("ssex") String ssex, @Param("sname") String sname) {
        StringBuffer sb = new StringBuffer();
        sb.append("update student ");
        if ((ssex != null && ssex != "") || (sname != null && sname != "")) {
            sb.append("set ");
            if (ssex != null && ssex != "") {
                sb.append("ssex = #{ssex} ,");
            }
            if (sname != null && sname != "") {
                sb.append("sname = #{sname} ,");
            }
            sb.delete(sb.length() - 1, sb.length());
        }
        if (sid != null && sid != 0) {
            sb.append("where sid = #{sid}");
        }
        return sb.toString();
    }

    public String selectOneOrMore(@Param("ssex") String ssex, @Param("sname") String sname, @Param("sage") Integer sage) {
        StringBuffer sb = new StringBuffer();
        sb.append("select sid,sname,ssex,sage from student");
        if ((ssex != null && ssex != "")||(sname != null && sname != "")||(sage != null && sage != 0)) {
            sb.append(" where");
            if (ssex != null && ssex != "") {
                sb.append(" ssex=#{ssex} and");
            }
            if (sname != null && sname != "") {
                sb.append(" sname like concat('%',#{sname},'%') and");
            }
            if (sage != null && sage != 0) {
                sb.append(" sage=#{sage} and");
            }
            sb.delete(sb.length() - 3, sb.length());
        }
        return sb.toString();
    }

    public String selectList(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from student");
        if (list.size() > 0) {
            sb.append(" where sid in ( ");
            for (Integer i : list) {
                sb.append(i);
                sb.append(" ,");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
        }
        return sb.toString();
    }
}
