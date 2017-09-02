package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			Hello obj = (Hello) context.getBean("helloWorld");

			obj.getMessage();
			context.close();

		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

}
