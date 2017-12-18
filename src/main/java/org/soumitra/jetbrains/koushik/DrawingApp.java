package org.soumitra.jetbrains.koushik;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//using beanfactory	
//		BeanFactory factory= new XmlBeanFactory (new FileSystemResource("spring.xml"));
//		Triangle triangle= (Triangle) factory.getBean("triangle");
//		triangle.drawTriangle();
		
		//using context
		context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle= (Triangle) context.getBean("nicetriangle");
		//System.out.println(triangle.getType());
		triangle.drawTriangle();
		
		ConstructorTriangle constructorTriangle= (ConstructorTriangle) context.getBean("indexconstructortriangle");
		System.out.println("int height: "+constructorTriangle.getHeight());
		System.out.println("string type: "+constructorTriangle.getType());
		
		ObjectTriangle objectTriangle = (ObjectTriangle) context.getBean("objecttriangle");
		objectTriangle.draw();
	
	}

}
