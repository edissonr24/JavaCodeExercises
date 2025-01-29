package org.example.SimpleExamples.java8.method_reference;

public class Employee {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}
