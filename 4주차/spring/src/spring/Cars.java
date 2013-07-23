package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Cars 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new FileSystemXmlApplicationContext("Map.xml");
 
    	Customer cust = (Customer)context.getBean("CustomerBean");
    	cust.run();
    }
}
