package org.example.JavaChallenges2024.p02_functional_prog.p02_operations_example;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // TODO
        //employeeList.forEach(System.out::println);

        /** 01. List all distinct project in non-ascending order. */
        List<Project> projectList = employeeList.stream().flatMap(project->project.getProjects().stream()).collect(Collectors.toList());
        List<String> projectNames = projectList.stream().map(project -> project.getName()).sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());

        List<String> projectNames2 = employeeList.stream()
                .flatMap(project->project.getProjects().stream())
                .map(project -> project.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        projectNames.forEach(System.out::println);
        projectNames2.forEach(System.out::println);
        System.out.println("-----------------------------------");

        /** 02. Print full name of any employee whose firstName starts with ‘A’. */
        Optional<Employee> anyEmployee = employeeList.stream().filter(x-> x.getFirstName().startsWith("A")).findAny();
        if (anyEmployee.isPresent()) {
            System.out.println("Fullname starts with A: " + anyEmployee.get().getFirstName());
        }
        System.out.println("-----------------------------------");

        /** 03. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters) */
        List<Employee> employees2023 = employeeList.stream().filter(employee -> employee.getId().startsWith("2023")).collect(Collectors.toList());
        employees2023.forEach(x-> System.out.println("Employees 2023:" + x.getId() + " - " + x.getFirstName()));
        System.out.println("-----------------------------------");

        /** 04. Sort employees based on firstName, for same firstName sort by salary. */
        List<Employee> employeesNameSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        employeesNameSalary.forEach(employee -> System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " - Salary: " + employee.getSalary()));
        System.out.println("-----------------------------------");

        /** 06. Print min salary. */
        Optional<Employee> minSalaryEmployee = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
        if (minSalaryEmployee.isPresent()) {
            System.out.println("Min salary: " + minSalaryEmployee.get().getFirstName() + " - " +minSalaryEmployee.get().getSalary());
        }
        System.out.println("-----------------------------------");

        /** 07. Print list of all employee with min salary. */
        double minSalary = employeeList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
        System.out.println("Min salary: " + minSalary);

        List<Employee> employeesMinSalary = employeeList.stream().filter(employee -> employee.getSalary() == minSalary).collect(Collectors.toList());
        employeesMinSalary.forEach(System.out::println);
        System.out.println("-----------------------------------");

        /** 08. List of people working on more than 2 projects. */
        Map<String, Long> employeeProjects2 = employeeList.stream().collect(Collectors.toMap(Employee::getId, emp-> (long)emp.getProjects().size()));
        Map<String, Long> employeeProjects = employeeList.stream().collect(Collectors.toMap(employee -> employee.getId().concat(employee.getFirstName()), emp-> (long)emp.getProjects().size()));

        employeeProjects.forEach((key, value) -> System.out.println("Employee " + key + " # " + value));

        Map<String, Long> filteredMap = employeeProjects.entrySet().stream().filter(entry -> entry.getValue() > 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        filteredMap.forEach((key, value) -> System.out.println("Employee Filtered " + key + " # " + value));
        System.out.println("-----------------------------------");

        /** 09. Count of total laptops assigned to the employees. */
        int totalLaptops = employeeList.stream().mapToInt(Employee::getTotalLaptopsAssigned).sum();
        System.out.println("Total de laptops: " + totalLaptops);
        System.out.println("-----------------------------------");

        /** 10. Count of all projects with Robert Downey Jr as PM. */
        List<Project> projectsDr = employeeList.stream().flatMap(p-> p.getProjects().stream()).filter(project -> project.getProjectManager().equals("Robert Downey Jr")).distinct().collect(Collectors.toList());
        projectsDr.forEach(project -> System.out.println("Project: " + project.getName() + " - " + project.getProjectManager()));
    }

}