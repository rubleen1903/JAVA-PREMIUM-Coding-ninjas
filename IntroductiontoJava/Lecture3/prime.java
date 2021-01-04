package IntroductiontoJava.Lecture3;
import java.util.Scanner;
public class prime {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = 2;
        while(d<=num/2)
        {
            if(num%d==0)
            {
                System.out.println("Not Prime");
                sc.close();
                return;
            }
            d+=1;
        }
        System.out.println("Prime");
        sc.close();
    }
    
}
