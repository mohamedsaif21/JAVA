package pdfpractices;


import java.util.*;
public class revP2 {

    public int reverseNumber(int n){

        int rev =0;
        while(n>0){
            int rem = n % 10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }

    public static void main (String [] args){
        revP2 obj = new revP2();
        System.out.println("Rev of 1234 is "+obj.reverseNumber(1234));
    }

    }
    

