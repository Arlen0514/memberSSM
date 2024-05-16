package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.DbConnection;

public class DbConnection {

	public static void main(String[] args) {
		System.out.print(DbConnection.getDb());

	}
	public static SqlSession getDb()
	{
		SqlSession s=null;
		
		try {
			Reader r=Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(r);
			s=sf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s;
	}

}
