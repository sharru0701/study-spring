package aop2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import aop2.buz.Student;
import aop2.buz.Worker;

public class AopMainClass02 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX02.xml");
		
		Student student = ctx.getBean("student" , Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker" , Worker.class);
		worker.getWorkerInfo();
		
		ctx.close();

	}

}
