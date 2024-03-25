package dao;

import domain.IDCard;
import domain.Person;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSession;
import util.MyUtil;

import java.util.List;

public interface PersonDao {

    //根据pid查询人+身份证信息
    @Results(
            id = "selectPerson",
            value = {
                    @Result(id = true,property = "pid",column = "pid"),
                    @Result(property = "pname",column = "pname"),
                    @Result(property = "cardid",javaType = IDCard.class,column = "cardid",one =@One(select = "selectIDCard") )
            }
    )
    @Select("select pid,pname,cardid from person where pid=#{pid}")
    public Person selectOne(Integer pid) ;

    @Select("select cardid,address from idcard where cardid=#{cardid}")
    public IDCard selectIDCard(String cardid);

    @Select("select pid,pname,cardid from person")
    @ResultMap("selectPerson")
    public List<Person> selectAll();

    @Insert("insert into person values (#{pid},#{pname},#{cardid})")
    public void insert(@Param("pid") Integer pid, @Param("pname") String pname, @Param("cardid") String cardid);
}
