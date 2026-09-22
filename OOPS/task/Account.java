package OOPS.task;

 public class Account{
        String name;
        long Accountno;
        double balance;

        Account(String name,long Accountno,double balance){

            this.name = name ;
            this.Accountno= Accountno;
            this.balance =balance;
        }

        public static void main(String[] args) {

            Account n = new Account("Ram" , 927393793 , 6300.10);
            
            System.out.println(n.name + " username");
            System.out.println(n.Accountno + " Account detials");
            System.out.println(n.balance + " This your current balance");

        }
    }

