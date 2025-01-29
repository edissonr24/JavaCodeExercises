package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations.exercises02;

class Student {
    private int rollNo;
    private String className;
    private String name;

    public Student(int rollNo, String className, String name) {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.rollNo == ((Student) obj).getRollNo();
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return "Student: " + this.getName() + " - " + this.getClassName() + " - " + this.getRollNo();
    }
}
