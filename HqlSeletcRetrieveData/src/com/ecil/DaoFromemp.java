package com.ecil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class DaoFromemp 
{

public static void main(String[] args)

{
Session session = HibernateUtility.getSession();

String hql="select employeeNumber,employeeName from com.ecil.Employee";
Query query = session.createQuery(hql);


List list = query.getResultList();

/**
 * size of the objects inthe entire table is 10,1 row in table  consider as one object
 */

System.out.println(list.size());
for (Object object : list) 

{
	Object[]elements=(Object[])object;
	System.out.println(elements[0]+ " "+ elements[1]);
	
}
session.close();
}
}
