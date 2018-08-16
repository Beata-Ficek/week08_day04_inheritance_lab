package models;

import javax.persistence.*;

@Entity
@Table(name= "employees")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {

    private int niNumber;
    private int salary;
    private int id;


    public Employee() {

    }


    public Employee(int niNumber, int salary) {
        this.niNumber = niNumber;
        this.salary = salary;
    }

    @Column(name = "ni_Number")
    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
