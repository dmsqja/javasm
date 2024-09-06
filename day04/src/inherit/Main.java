package inherit;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(100,"James",1000);
        Manager mgr = new Manager(101,"Tom",1000,100);

        System.out.println(emp.getSalary());
        System.out.println(mgr.getSalary());
        System.out.println(mgr.getBonus());

        System.out.println(emp.getAnnSalary());
        System.out.println(mgr.getAnnSalary());

        System.out.println(emp.toString());
        System.out.println(mgr.toString());

        //emp.salary = 100000000;
        //Employee is an Object
        //Object obj = new Employee();
    }
}
