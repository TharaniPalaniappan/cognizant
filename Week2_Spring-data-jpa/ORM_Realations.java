package com.cognizant.ormlearn;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//======================================================
// Employee Entity
//======================================================

@Entity
@Table(name = "employee")
class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "em_id")
    private int id;

    @Column(name = "em_name")
    private String name;

    @Column(name = "em_salary")
    private double salary;

    @Column(name = "em_permanent")
    private boolean permanent;

    @Temporal(TemporalType.DATE)
    @Column(name = "em_date_of_birth")
    private Date dateOfBirth;

    // ================= Many To One =================

    @ManyToOne
    @JoinColumn(name = "em_dp_id")
    private Department department;

    // ================= Many To Many =================

    @ManyToMany(fetch = FetchType.EAGER)

    @JoinTable(
            name = "employee_skill",
            joinColumns = @JoinColumn(name = "es_em_id"),
            inverseJoinColumns = @JoinColumn(name = "es_sk_id"))
    private Set<Skill> skillList;

    public Employee() {
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



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }



    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public Set<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(Set<Skill> skillList) {
        this.skillList = skillList;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", permanent=" + permanent +
                ", dateOfBirth=" + dateOfBirth + "]";
    }

}


//======================================================
// Department Entity
//======================================================

@Entity
@Table(name = "department")
class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dp_id")
    private int id;

    @Column(name = "dp_name")
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Employee> employeeList;

    public Department() {
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



    public Set<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Set<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department [id=" + id +
                ", name=" + name + "]";
    }

}



//======================================================
// Skill Entity
//======================================================

@Entity
@Table(name = "skill")
class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sk_id")
    private int id;

    @Column(name = "sk_name")
    private String name;

    @ManyToMany(mappedBy = "skillList")
    private Set<Employee> employeeList;

    public Skill() {
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



    public Set<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Set<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id +
                ", name=" + name + "]";
    }

}



//======================================================
// Repository Interfaces
//======================================================

@Repository
interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

@Repository
interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

@Repository
interface SkillRepository extends JpaRepository<Skill, Integer> {
}
