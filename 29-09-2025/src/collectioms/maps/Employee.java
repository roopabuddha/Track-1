package collectioms.maps;

public class Employee {
    private String name;
    private String job;
    private float salary;

    public Employee(String name, String job, float salary) {
        super(); //super most class -> object class coms allowes sub class constructor to create object class
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Employee [name= " + name + ", job= " + job + ", salary= " + salary + "]";
    }
}
