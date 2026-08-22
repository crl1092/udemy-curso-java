package edu.crislima.udemycurso.application.entities;

public class Employee {
    public String name;
    public double bruteSalary;
    public double tax;

    public void infos() {
        System.out.println("Name: " + name);
        System.out.println("Brute Salary: " + bruteSalary);
        System.out.println("Salary: " + (bruteSalary - tax));
    }

    public void increaseSalary(double percentage) {
        System.out.println("Salary percentage incremented: " + ((bruteSalary - tax) * percentage));
    }
}