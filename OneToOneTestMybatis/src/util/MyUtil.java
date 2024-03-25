package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyUtil {
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
}
