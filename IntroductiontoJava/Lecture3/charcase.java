package IntroductiontoJava.Lecture3;

import java.util.Scanner;
public class charcase {
    
    public static void main(String[] args) {
        // Write your code here
     Scanner sc = new Scanner (System.in);
        String nm= sc.next();
        char a = nm.charAt(0);
        if (a>=97 && a <=122)
        {
            System.out.println(0);
        }
        else if(a>=65 && a<=90)
        {
            System.out.println(1);
        }
        else 
        {
            System.out.println(-1);
        }
        sc.close();
        
    }
}
