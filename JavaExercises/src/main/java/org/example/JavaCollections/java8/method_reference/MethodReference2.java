package org.example.SimpleExamples.java8.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference2 {
    public static void main(String args[]) {

        MethodReference2 methodReferenceTest = new MethodReference2();

        ArrayList<Person> personList = new ArrayList();
        personList.add(new Person("person1"));
        personList.add(new Person("person2"));
        personList.add(new Person("person3"));
        personList.add(new Person("person4"));

        methodReferenceTest.convertToEmployee(personList);
    }

    private void convertToEmployee(ArrayList<Person> personList) {

        System.out.println("-------Using Lambda Functions--------");

        //Using Lambda function to call recruit method
        personList.stream().map(person -> this.recruit(person))
                .collect(Collectors.toList()).forEach(s -> System.out.println(s));

        System.out.println("-------Using Method Reference--------");

        //Using method reference to call recruit method
        personList.stream().map(this::recruit).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-------Using Edi Reference--------");
        List<Employee> employeeList = new ArrayList<>();
        employeeList = personList.stream().map(person -> recruit(person)).collect(Collectors.toList());
        employeeList.forEach(employee -> System.out.println(employee.getName()));

    }

    private Employee recruit(Person person)
    {
        Employee emp = new Employee(person.getName());
        return emp;
    }

}
