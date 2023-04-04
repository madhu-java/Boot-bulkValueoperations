package com.madhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.madhu.comp.Company;
import com.madhu.comp.Company2;

@SpringBootApplication
public class Boot04BulkoperationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot04BulkoperationsApplication.class, args);
	Company company = context.getBean(Company.class);
	System.out.println(company);
	
	Company2 company2 = context.getBean(Company2.class);
	System.out.println(company2);
		
		((ConfigurableApplicationContext) context).close();
	
	
	}

}
