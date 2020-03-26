import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import entity.Provider;

class test {

	@Test
	void test() {
		try {
			//1、获取mybatis核心配置文件的一个输入流对象
			InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
			//2、通过输入流来创建SQL session factory对象
			SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
			//3、通过SQL session factory对象来创建SQL session对象
			SqlSession sqlsession = fac.openSession();
			//4、调用SQL session对象的方法来执行操作
			//执行sql语句只返回一个数据的方法 selectOne
			int pro = sqlsession.selectOne("selOne");
			System.out.println("获得的数据总数："+pro);
			//5、关闭SQL session对象
			sqlsession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
