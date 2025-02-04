package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.DepartmentService;
import com.demo.service.DepartmentServiceImpl;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestHibernateCrud {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		DepartmentService dservice=new DepartmentServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n 2. Add new Department\n 3. delete employee\n");
		System.out.println("4. delete department\n 5. modify Department\n 6. modify employee\n");
		System.out.println("7. display Employee by id\n 8. display Department by id\n 9. display all department\n");
		System.out.println("10. display all Employee\n 11.exit\n choice : ");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			eservice.addnewEmployee();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			List<Employee> elist=eservice.getAllEmployee();
			elist.forEach(System.out::println);
			break;
		case 11:
			eservice.closeMyConnection();
			System.out.println("Thank you for visiting .....");
			break;
		default:
			break;
		}
		}while(choice!=11);

	}

}
