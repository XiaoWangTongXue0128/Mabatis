package dao;

import domain.IDCard;
import domain.Person;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.session.SqlSession;
import util.MyUtil;

import java.util.List;

public interface IDCardDao {

    @Results(
            id = "selectPerson",
            value = {
                    @Result(id = true,property = "cardid",column = "cardid"),
                    @Result(property ="address",column = "address"),
                    @Result(property = "person",column = "cardid",javaType = Person.class,one = @One(select = "selectPerson",fetchType = FetchType.LAZY))
            }
    )
    @Select("select cardid,address from idcard where cardid=#{cardid}")
    public IDCard selectOne(String id);

    @Select("select pid,pname,cardid from person where cardid = #{cardid}")
    public Person selectPerson(String cardid);

    @ResultMap("selectPerson")
    @Select("select cardid,address from idcard")
    public List<IDCard> selectAll();

}
