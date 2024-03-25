package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MySpring {
    private static Map<String, Object> map = new HashMap<>();
    private static SqlSessionFactory factory;
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");
        //选择环境
        //factory = builder.build(is,"development2");
        factory = builder.build(is);
    }

    public static SqlSession getSqlSession() {
        return factory.openSession(false);
    }

    public static SqlSession getSqlSession(Boolean flag) {
        return factory.openSession(flag);
    }


    public static <T> T getBean(String classname) {
        T obj = (T) map.get(classname);
        if (obj == null) {
            try {
                obj = (T) Class.forName(classname).newInstance();
                map.put(classname, obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }
}
