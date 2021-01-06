package IntroductiontoJava.Lecture3;
import java.util.Scanner;
public class questpattern2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
      
        while(i<=num)
        {   int sp=1;
            while(sp <=num-i)
            {
                System.out.print(" ");
                sp+=1;
            }
            int j =1;
            while(j<=i)
            {
                System.out.print(j+(i-1));
                // System.out.print(" ");
                j+=1;
            }
            
            System.out.println();
            i+=1;
        }
        sc.close();
    }
    
}

