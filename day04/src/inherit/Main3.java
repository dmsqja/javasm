package inherit;

public class Main3 {
    public static void main(String[] args) {
        Employee [] emps = new Employee[4];

        // Heterogeneous Collection
        emps[0] = new Employee(100,"james",1000);
        emps[1] = new Employee(101,"tom",1000);
        emps[2] = new Manager(102,"tomas",1000,100);
        emps[3] = new Manager(103,"kim",1000,100);

        for(Employee e : emps) {
            System.out.println(e);
            System.out.println(e.getAnnSalary());
            if(e instanceof Manager) {
                Manager m = (Manager)e;
                System.out.println(m.getBonus());
            }
        }


    }
}
