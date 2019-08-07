package com.zuoyanD.service;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.zuoyanD.model.Employee;
import com.zuoyanD.utils.StringUtils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private static Employee stringToEmployee(String employeeStr) {
        List<String> employeeStrList = Arrays.asList(employeeStr.split(", "));
        return new Employee(employeeStrList.get(0), employeeStrList.get(1), employeeStrList.get(2), employeeStrList.get(3));
    }

    public List<Employee> convertToEmployees(List<String> employeeStringList) {
        return employeeStringList.stream().map(EmployeeService::stringToEmployee).collect(Collectors.toList());
    }

    public boolean birthIsToday(Employee employee) {
        LocalDate localDateTime = LocalDate.now();
        LocalDate employeeBirthDay = StringUtils.formateDateFromStr(employee.getDateOfBirth(), "yyyy/MM/dd");
        return employeeBirthDay.getMonthValue() == localDateTime.getMonthValue() && employeeBirthDay.getDayOfMonth() == localDateTime.getDayOfMonth();
    }

}
