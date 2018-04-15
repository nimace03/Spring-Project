package com.testspringonly.testwebSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestWebSpringApplication {

	public static void main(String[] args) {
		//BinarySearch ObjBinary = new BinarySearch(new QuickSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(TestWebSpringApplication.class,args);
		BinarySearch ObjBinary = applicationContext.getBean(BinarySearch.class);
		int result = ObjBinary.BinarySearchs(new int[]{12,12,12},13);
		System.out.println("The Result is "+result);
	}
}
