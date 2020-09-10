package com.github.test;
import com.github.dao.UserMapper;
import com.github.pojo.SysUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public class MybatisTest {
    public static void main(String[] args) {
        //1.加载核心配置文件
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.通过sqlSessionFactory 工厂 加工一个sqlSession
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.开启会话
            SqlSession sqlSession = sqlSessionFactory.openSession();
            /*为接口创建对象*/
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
           List<SysUser> userList = userMapper.getUser();
            //查询所有用户

            for (SysUser sysUser : userList){
                System.out.println("用户id"+sysUser.getUID());
                System.out.println("用户名"+sysUser.getuName());
                System.out.println("用户密码"+sysUser.getuPassword());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
