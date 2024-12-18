package org.example.JavaChallenges2024.p02_functional_prog.p02_operations_example;

import java.util.*;
import java.util.stream.Collectors;

public class App2 {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // Count Employees
        long totalEmployees = employeeList.stream().count();
        System.out.println("Total Employees: " + totalEmployees);

        // Print with peak
        employeeList.stream().forEach(e -> System.out.println("Employee: " + e.getFirstName()));

        // 01. List all distinct project in non-ascending order.
        System.out.println("\n ====== List all distinct project in non-ascending order. ======");
        List<Project> projectList = employeeList.stream().flatMap(x-> x.getProjects().stream()).collect(Collectors.toList());

        List<String> projectNames = projectList.stream().map(p-> p.getName()).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        projectNames.forEach(System.out::println);

        System.out.println("\n ====== List all distinct project in non-ascending order. ======");
        employeeList.stream().flatMap(employee -> employee.getProjects().stream()).distinct()
                .sorted((p1, p2) -> {
                    return -p1.getName().compareTo(p2.getName());
                }).forEach(project -> System.out.println(project.getName()));

        // -------------------------------------------------------------------------------------------------------------
        // 02. Print full name of any employee whose firstName starts with ‘A’
        System.out.println("\n ====== Print full name of any employee whose firstName starts with ‘A’. ======");
        employeeList.stream().filter(e -> e.getFirstName().startsWith("A")).forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName()));

        System.out.println("\n ====== Print full name of any employee whose firstName starts with ‘A’. ======");
        employeeList.stream().filter(employee -> employee.getFirstName().startsWith("A"))
                .forEach(System.out::println);

        // -------------------------------------------------------------------------------------------------------------
        // 03. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)
        System.out.println("\n ====== List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters) ======");
        employeeList.stream().filter(e->e.getId().startsWith("2023")).forEach(System.out::println);

        System.out.println("\n ====== List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters) ======");
        employeeList.stream().filter(employee -> employee.getId().substring(0, 4).equals("2023"))
                .forEach(System.out::println);
        // -------------------------------------------------------------------------------------------------------------
        // 05. Sort employees based on firstName, for same firstName sort by salary.
        System.out.println("\n ====== Sort employees based on firstName, for same firstName sort by salary. ======");
        //employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary)).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName).reversed().thenComparing(Employee::getSalary)).forEach(System.out::println);

        //employeeList.stream().sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName())).forEach(System.out::println);

        System.out.println("\n ====== Sort employees based on firstName, for same firstName sort by salary. ======");
        employeeList.stream().sorted((e1, e2) -> {
            int comparison = e1.getFirstName().compareTo(e2.getFirstName());
            if (comparison == 0) {
                return e1.getSalary() - e2.getSalary();
            }
            return comparison;
        }).forEach(System.out::println);

        // -------------------------------------------------------------------------------------------------------------
        // 06. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
        System.out.println(
                "\n ====== Print names of all employee with 3rd highest salary. (generalise it for nth highest salary). ======");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("********");
        Optional<Employee> thirdSalaryEmp = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
        if (thirdSalaryEmp.isPresent()) {
            System.out.println(thirdSalaryEmp.get().getSalary());
            Integer bigSalary = thirdSalaryEmp.get().getSalary();
            employeeList.stream().filter(employee -> employee.getSalary() == bigSalary).forEach(System.out::println);
        }

        System.out.println(
                "\n ====== Print names of all employee with 3rd highest salary. (generalise it for nth highest salary). ======");
        int n = 3;
        Optional<Integer> findFirst = employeeList.stream().sorted((e1, e2) -> {
            return e2.getSalary() - e1.getSalary();
        }).map(each -> each.getSalary()).distinct().limit(n).skip(n - 1).findFirst();
        if (findFirst.isPresent()) {
            Integer nThSalary = findFirst.get();
            employeeList.stream().filter(e -> e.getSalary() == nThSalary.intValue())
                    .forEach(System.out::println);
        }

        // -------------------------------------------------------------------------------------------------------------
        // 07. Print list of all employee with min salary.
        System.out.println("\n ====== Print Min Sal ======");
        Integer minSalary = employeeList.stream().mapToInt(Employee::getSalary).min().getAsInt();
        System.out.println(minSalary);

        System.out.println("\n ====== Print list of all employee with min salary. ======");
        employeeList.stream().filter(employee -> employee.getSalary()==minSalary).forEach(System.out::println);

        System.out.println("\n ====== Print Min Sal ======");
        Optional<Employee> findFirstMin = employeeList.stream().sorted((e1, e2) -> {
            return e1.getSalary() - e2.getSalary();
        }).findFirst();
        if (findFirstMin.isPresent()) {
            int salary = findFirstMin.get().getSalary();
            System.out.println(salary);
            System.out.println("\n ====== Print list of all employee with min salary. ======");
            employeeList.stream().filter(e -> e.getSalary() == salary).forEach(System.out::println);
        }



        // -------------------------------------------------------------------------------------------------------------
        // 08. List of people working on more than 2 projects.
        System.out.println("\n ====== List of people working on more than 2 projects. ======");
        employeeList.stream().filter(employee -> employee.getProjects().size() > 2).forEach(System.out::println);

        System.out.println("\n ====== List of people working on more than 2 projects. ======");
        employeeList.stream().filter(each -> each.getProjects().size() > 2).forEach(System.out::println);


        // -------------------------------------------------------------------------------------------------------------
        /** 09. Count of total laptops assigned to the employees. **/
        System.out.println("\n ====== Count of total laptops assigned to the employees. ======");
        int total = employeeList.stream().mapToInt(employee -> employee.getTotalLaptopsAssigned()).sum();
        System.out.println(total);

        System.out.println("\n ====== Count of total laptops assigned to the employees. ======");
        int sum = employeeList.stream().mapToInt(each -> each.getTotalLaptopsAssigned()).sum();
        System.out.println(sum);

        // -------------------------------------------------------------------------------------------------------------
        /** 10. Count of all projects with Robert Downey Jr as PM. **/
        System.out.println("\n ====== Count of all projects with Robert Downey Jr as PM.. ======");
        //employeeList.stream().filter(employee -> employee.getProjects().stream().anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr"))).forEach(System.out::println);
        long c = employeeList.stream().filter(employee -> employee.getProjects().stream().anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr"))).count();
        System.out.println(c);

        /** 11. List of all projects with Robert Downey Jr as PM. **/
        // Map of all the projects
        List<Project> projectList1 = employeeList.stream().flatMap(employee -> employee.getProjects().stream().filter(project -> project.getProjectManager().equals("Robert Downey Jr"))).collect(Collectors.toList());
        System.out.println("\n ====== List of all projects with Robert Downey Jr as PM. ======");
        projectList1.stream().distinct().forEach(project -> System.out.println(project.getName() + " " + project.getProjectManager()));

        /** 12. List of all people working with Robert Downey Jr. **/
        System.out.println("\n ====== List of all people with Robert Downey Jr as PM. ======");
        employeeList.stream().filter(employee -> employee.getProjects().stream().anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr"))).forEach(System.out::println);

        System.out.println("\n ====== List of all people with Robert Downey Jr as PM. ======");
        //  Project Delta = new Project("Delta Model", "Login", "Robert Downey Jr");
        //        Project CommonUI = new Project("Common UI", "UI", "Robert Downey Jr");
        String pm = "Robert Downey Jr";
        employeeList.stream().filter(
                        each -> each.getProjects().stream().anyMatch(eachP -> pm.equalsIgnoreCase(eachP.getProjectManager())))
                .forEach(System.out::println);

        /** 13. Create a map based on this data, they key should be the year of joining, and value should be list of all
         *  the employees who joined the particular year. (Hint : Collectors.toMap) **/
        System.out.println("\n ====== mapOfEmployeeOnJoiningYear ======");
        Map<String, List<Employee>> employeesMap = employeeList.stream().
                collect(Collectors.groupingBy(employee -> employee.getId().substring(0,4), Collectors.mapping(employee -> employee, Collectors.toList())));

        for (Map.Entry<String, List<Employee>> entry : employeesMap.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(System.out::println);
        }


        /** 14. Create a map based on this data, the key should be year of joining and value should be the count of people joined
         *  in that particular year. (Hint :Collectors.groupingBy()) */
        System.out.println("\n ====== mapOfEmployeeCountOnJoiningYear ======");
        Map<String, Long> employeesCount = employeeList.stream().
                collect(Collectors.groupingBy(employee -> employee.getId().substring(0,4), Collectors.counting()));

        for (Map.Entry<String, Long> entry : employeesCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


    // https://medium.com/@amol_shinde/answers-practice-java-streams-questions-practice-java-streams-questions-8a76cbfee1be-f75a018ee4f5
}
