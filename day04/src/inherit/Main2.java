package inherit;

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Manager(111,"james",1000,100);
        System.out.println(emp.toString());
        System.out.println(emp.getSalary());
        System.out.println(emp.getAnnSalary());
    }
}
