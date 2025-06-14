package com.akgulberk.starter;

import com.akgulberk.dto.DtoEmployee;
import com.akgulberk.services.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ExceptionManagementApplication.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService  employeeService;

	@Test
	public void testFindEmployeeById(){
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		
//		if(employee!=null){
//			System.out.println("İsim: " +employee.getName());
//		}
	}

}
