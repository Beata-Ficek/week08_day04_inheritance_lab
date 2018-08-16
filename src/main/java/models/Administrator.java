package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee{

    private Manager manager;

//    private List<Manager> managers;

    public Administrator(int niNumber, int salary, Manager manager){
        super(niNumber, salary);
        this.manager = manager;
//        this.managers = new ArrayList<Manager>();
    }

    public Administrator(){

    }


    @ManyToOne
    @JoinColumn(name="manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

//    public void addManager(Manager manager) {
//        this.managers.add(manager);
//    }
}
