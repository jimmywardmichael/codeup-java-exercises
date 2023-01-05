//interface example
public class Developer implements Business{
    public void drinkCoffee(){
        String abomination = "Vanilla Chai Pumpkin spice mocha frappe latte";
        System.out.println(abomination);
    }

    public static void main(String[] args) {
        //developer object instance
        Developer mattttias = new Developer();
        mattttias.drinkCoffee();

    }
}


//// abstract class example
//public class Developer extends Employee {
//    public Developer(String name, String department) {
//        super(name, department);
//    }
//    public String work() {
//        return "writing code";
//    }
//
//    public static void main(String[] args) {
//        Employee gil = new Developer("Gil", "IT");
//        System.out.println(gil.name + " the developer is " + gil.work() + " in " + gil.department);
//    }
//}