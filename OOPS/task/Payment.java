package OOPS.task;

    abstract class Payment {
    
    int amount ;

    Payment (int amount){
        this.amount=amount;
    }
        abstract void pay();
}

    class CreditCard extends Payment{

        CreditCard(int amount){
            super (amount);
        }
        void pay(){
            System.out.println("Paid using creditcard");
        }
    }
    class main {

        public static void main(String[] args) {
                
                Payment p1 = new CreditCard(500);
                p1.pay();
            }
        }
    

