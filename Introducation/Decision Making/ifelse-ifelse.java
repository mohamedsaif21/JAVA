class ifelse {
    public static void main(String[] args) {    
        int a = 11;
        if (a >= 18) {
            System.out.println("adult");
            if(a>=60){

                System.out.println("senior citizen");
            }
         else {
            System.out.println("Youngster");
        }  
    } 
    
    else {
        System.out.println("minor");

        if(a<=10){
            System.out.println("child");
            }
        else{
            System.out.println("teenager");
        }
    }
}
}
    