import java.util.Scanner;
// print space-separted integers representing the primt number till the given positive
public class primeinRange {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i =2; i<=num-1 ; i++){
            if(num%i==0){
                for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            }
            
        }
            if(isPrime==true){
                System.out.println("It is Prime");
            }
            else{
                 System.out.println("It is not Prime");
            }
               
        }
    //convert this sample input = 11 and the output 2 3 5 7 11
}
