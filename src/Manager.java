public class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "holding meetings";
    }

    public static void main(String[] args) {
        Employee bob = new Manager("bob","Sales");
        System.out.println(bob.work() + " in " + bob.department);
    }
}

//public class Manager extends Employee{
//    public String work() {
//        return "Managing employees";
//    }
//
//    public static void doWork(Employee e) {
//        System.out.println(e.work());
//    }
//
//    public static void main(String[] args) {
//        Employee one = new Employee();
//        Employee two = new Manager();
//
//        doWork(one); // "Filling out TPS reports"
//        doWork(two); // "Managing employees"
//    }
//}