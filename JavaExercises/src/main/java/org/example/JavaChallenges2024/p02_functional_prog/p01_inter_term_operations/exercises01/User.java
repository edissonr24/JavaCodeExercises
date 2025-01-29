package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations.exercises01;

class User {
    private String id;
    private String name;
    private Integer age;

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getAge() {
        return age;
    }

    void setAge(Integer age) {
        this.age = age;
    }

    User(String id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id +
                ", name=" + name + ", age=" + age + "]";
    }
}