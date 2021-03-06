package com.simplilearn.webapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.webapp.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//       Tightly coupled class
//       Employee employee = new Employee();
//       employee.setEmpId(101);
//       employee.setName("Luice Litt");
//       employee.setDept("Finance");
//       employee.setSalary(786534.54);
//       
//       System.out.println(employee);
    	
    	// IOC  : Inversion Of Control => Dependency injection is a pattern we can use to implement IOC
    	
    	// 1. Application Context Container Type
//    	ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//    	Employee emp1 = (Employee) context.getBean("emp1");
//    	Employee emp2 = (Employee) context.getBean("emp2");
//    	System.out.println(emp1);
//    	System.out.println(emp2);
    	
    	// 2. Bean Factory Container
    	Resource resource = new ClassPathResource("appContext.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	Employee emp1 = (Employee) factory.getBean("emp1");
    	System.out.println(emp1);
    	
    	Employee emp2 = factory.getBean("emp2",Employee.class);
    	System.out.println(emp2);
    	
    	
    }
}
