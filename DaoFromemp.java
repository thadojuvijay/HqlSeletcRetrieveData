package com.ecil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class DaoFromemp 
{

public static void main(String[] args)

{
Session session = HibernateUtility.getSession();

String hql="select employeeSalary from com.ecil.Employee";
Query query = session.createQuery(hql);


List list = query.getResultList();
for (Object object : list) {
	
	System.out.println(object);
}
System.out.println(list);
session.close();
}
}
