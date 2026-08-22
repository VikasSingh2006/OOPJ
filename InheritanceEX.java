interface Employee {
    void EmpInfo();
}

interface EmpSalary {
    void Salary();
}

public class InheritanceEX implements Employee, EmpSalary {

    String name;
    int age;
    double salary;

    InheritanceEX(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public void EmpInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }

    @Override
    public void Salary() {
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        InheritanceEX obj =
                new InheritanceEX("Vikas", 20, 30000);

        obj.EmpInfo();
        obj.Salary();
    }
}