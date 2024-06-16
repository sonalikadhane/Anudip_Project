package com.lms.utility;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.lms.entity.AdminDetails;
import com.lms.entity.BookDetails;
import com.lms.entity.TransactionDetails;
import com.lms.entity.UserDetails;

public class HibernateUtility {


	
	
	private static SessionFactory sessionFactory;
		
		public static SessionFactory getSessionFactory()
		{
			if(sessionFactory==null)
			{
				try 
				{
					Configuration configuration=new Configuration();
					Properties settings=new Properties();
					settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
					settings.put(Environment.URL, "jdbc:mysql://localhost:3306/lib");
					settings.put(Environment.USER, "root");
					settings.put(Environment.PASS, "root");
					settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
					settings.put(Environment.SHOW_SQL, "true");
					settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
					settings.put(Environment.HBM2DDL_AUTO, "update");
					configuration.setProperties(settings);
					configuration.addAnnotatedClass(AdminDetails.class);
					configuration.addAnnotatedClass(UserDetails.class);
					configuration.addAnnotatedClass(BookDetails.class);
					configuration.addAnnotatedClass(TransactionDetails.class);
					
					StandardServiceRegistry serviceRegistery=new StandardServiceRegistryBuilder().
							applySettings(configuration.getProperties()).build();
							
					sessionFactory=configuration.buildSessionFactory(serviceRegistery);
					
				} 
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			
			return sessionFactory;
			
		}

	


}
