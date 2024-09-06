package inherit;

// Manager is an Employee
public class Manager extends Employee {
    private double bonus;
    public Manager() {}

    public Manager(int empNo, String name, double salary, double bonus) {
        super(empNo, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager : " +getEmpNo()+" "+getName()+" "+getSalary()+" "+this.bonus;
    }



    @Override
    public double getAnnSalary() {
        return super.getAnnSalary() + this.bonus;
    }
}
