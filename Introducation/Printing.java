public class Printing{

    public static void main(String[] args){
        String name = "saif";
        int age = 25;
        double salary = 50000.50;
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
        //Basic
        System.out.printf("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
    }


}