package com.zuoyanD.ServiceTest;

import com.zuoyanD.model.Employee;
import com.zuoyanD.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class EmployeeServiceTest {

    @Test
    public void convertToEmployees() {
        List<String> employees = new ArrayList<>();
        String employee1 = "Doe, John, 1982/10/08, john.doe@foobar.com";
        String employee2 = "Ann, Mary, 1975/09/11, mary.ann@foobar.com";
        employees.add(employee1);
        employees.add(employee2);
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.convertToEmployees(employees);
        employeeList.forEach(employee -> {
            System.out.println(employee.getFirstName());
            System.out.println(employee.getLastName());
            System.out.println(employee.getDateOfBirth());
            System.out.println(employee.getEmail());
            System.out.println("-------------------------");
        });
        Assert.assertEquals(2, employeeList.size());
    }
}
