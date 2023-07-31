package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.Objects;

public class Employee {

    int id;
    String name;
    String surname;

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", salary=" + salary +
            '}';
    }

    int age;
    int salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;


   return Objects.equals(employee.name,name)&&
       Objects.equals(employee.id,id)&&
       Objects.equals(employee.age,age)&&
       Objects.equals(employee.surname,surname)&&
       Objects.equals(employee.salary,salary);}

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  Employee (int id, String name, String surname, int age, int salary) {
       this.id=id;
       this.name=name;
       this.surname=surname;
       this.age=age;
       this.salary=salary;
    }

}