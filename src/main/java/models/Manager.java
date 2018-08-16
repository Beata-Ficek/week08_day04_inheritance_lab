package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee{

    private int budget;
    private String department;
    private List<Administrator> administrators;


    public Manager(int niNumber, int salary, int budget, String department){
        super(niNumber, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();

    }

    public Manager(){

    }

    @Column(name="budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Column(name="department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }

    public void addAdministrator(Administrator administrator){
        this.administrators.add(administrator);
    }
}
