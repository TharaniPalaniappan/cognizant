import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Set;

//======================================================
// Employee Service
//======================================================

@Service
class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee get(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}

//======================================================
// Department Service
//======================================================

@Service
class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Department get(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Department department) {
        departmentRepository.save(department);
    }
}

//======================================================
// Skill Service
//======================================================

@Service
class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Transactional
    public Skill get(int id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Skill skill) {
        skillRepository.save(skill);
    }
}

//======================================================
// Spring Boot Application
//======================================================

@SpringBootApplication
public class OrmLearnApplication {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private SkillService skillService;

    public static void main(String[] args) throws Exception {

        var context = SpringApplication.run(OrmLearnApplication.class, args);

        OrmLearnApplication app = context.getBean(OrmLearnApplication.class);

        // Uncomment one method at a time

        app.testGetEmployee();
        // app.testAddEmployee();
        // app.testUpdateEmployee();
        // app.testGetDepartment();
        // app.testAddSkillToEmployee();
    }

    //==================================================

    public void testGetEmployee() {

        System.out.println("\n----- Employee Details -----");

        Employee employee = employeeService.get(1);

        System.out.println(employee);
        System.out.println(employee.getDepartment());
        System.out.println(employee.getSkillList());
    }

    //==================================================

    public void testAddEmployee() throws Exception {

        Employee employee = new Employee();

        employee.setName("Thara");
        employee.setSalary(50000);
        employee.setPermanent(true);

        employee.setDateOfBirth(
                new SimpleDateFormat("dd/MM/yyyy")
                        .parse("20/02/2004"));

        Department department = departmentService.get(1);

        employee.setDepartment(department);

        employeeService.save(employee);

        System.out.println("Employee Added Successfully");
    }

    //==================================================

    public void testUpdateEmployee() {

        Employee employee = employeeService.get(1);

        Department department = departmentService.get(2);

        employee.setDepartment(department);

        employeeService.save(employee);

        System.out.println("Employee Updated Successfully");
    }

    //==================================================

    public void testGetDepartment() {

        Department department = departmentService.get(1);

        System.out.println(department);

        System.out.println("Employees");

        for (Employee employee : department.getEmployeeList()) {
            System.out.println(employee);
        }
    }

    //==================================================

    public void testAddSkillToEmployee() {

        Employee employee = employeeService.get(1);

        Skill skill = skillService.get(2);

        Set<Skill> skills = employee.getSkillList();

        skills.add(skill);

        employee.setSkillList(skills);

        employeeService.save(employee);

        System.out.println("Skill Added Successfully");
    }

}
