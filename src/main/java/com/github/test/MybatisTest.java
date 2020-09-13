package com.github.test;
import com.github.dao.HouseMapper;
import com.github.dao.SelectMapper;
import com.github.pojo.HosHouse;
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


       /* //1.加载核心配置文件
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.通过sqlSessionFactory 工厂 加工一个sqlSession+
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.开启会话
            SqlSession sqlSession = sqlSessionFactory.openSession();
            *//*为接口创建对象*//*
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
        */

        //查询房屋类型
       /* //1.1.加载核心配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.通过sqlSessionFactory 工厂 加工一个sqlSession+
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.开启会话
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //为接口创建对象
            TypeMapper typeMapper = sqlSession.getMapper(TypeMapper.class);
            List<HosType> typeList = typeMapper.getType();
            //查询所有房屋类型
            for (HosType hosType : typeList){

                    System.out.println("房屋类型编号"+hosType.gethTID());
                    System.out.println("房屋类型名称"+hosType.gethTName());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
       //查询所有的房屋信息
        //1.1.加载核心配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.通过sqlSessionFactory 工厂 加工一个sqlSession+
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //3.开启会话
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //为接口创建对象
            HouseMapper houseMapper = sqlSession.getMapper(HouseMapper.class);
            List<HosHouse> houseList = houseMapper.getHouse();
            //查询所有出租屋信息
            for (HosHouse hosHouse : houseList){
                System.out.println("房屋编号"+hosHouse.gethMID());
                System.out.println("用户编号"+hosHouse.getUID());
                System.out.println("街道编号"+hosHouse.getSID());
                System.out.println("房屋类型"+hosHouse.gethTID());
                System.out.println("价格"+hosHouse.getPrice());
                System.out.println("标题"+hosHouse.getTopic());
                System.out.println("内容"+hosHouse.getContents());
                System.out.println("时间"+hosHouse.gethTime());
                System.out.println("复制"+hosHouse.getCopy());
            }
    } catch (IOException e) {
        e.printStackTrace();
    }

/*
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactorys = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactorys.openSession();
            SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
