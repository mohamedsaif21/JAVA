import java.util.Scanner;

class adult {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("adult");

            if (age >= 60) {
                System.out.println("senior citizen");
            } else {
                System.out.println("young");
            }

        } else {
            System.out.println("minor");

            if (age >= 13) {
                System.out.println("teenager");
            }
        }

        sc.close();
    }
}