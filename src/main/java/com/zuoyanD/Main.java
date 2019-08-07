package com.zuoyanD;

import com.google.common.base.Function;
import com.zuoyanD.model.Email;
import com.zuoyanD.model.Employee;
import com.zuoyanD.service.EmailService;
import com.zuoyanD.service.EmployeeService;
import com.zuoyanD.utils.FileUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "d:\\tmp\\employeeInfo.txt";
        String subject = "Happy birthday! ";
        String content = "Happy birthday, dear ";

        EmployeeService employeeService = new EmployeeService();
        EmailService emailService = new EmailService();

        List<Employee> employeeList = employeeService.convertToEmployees(FileUtil.readFileIntoList(path));
        employeeList.stream().filter(employeeService::birthIsToday)
        .forEach(employee -> {
            Email email = new Email(subject,content+employee.getFirstName()+"!");
            emailService.send(employee.getEmail(), email);
        });

    }


}
