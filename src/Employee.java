
    class Employee extends Person {
        private double salary;
        public void doWork() {
            System.out.println("Work, work...");
        }

        public static void main(String[] args) {
            Person p = new Person();
            Employee e = new Employee();
            e.sayHello();
            e.doWork();
        }
//    public Employee(String employeeName) {
//        super(employeeName);
//    }
//    public static void main(String[] args) {
//        Employee john = new Employee("John");
//        john.sayHello();
//        System.out.println(john.name);
//    };
};




