package IntroductiontoJava.Lecture3;
import java.util.Scanner;
public class sumofevenodd {
    public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int sume=0, sumo=0;
        while(num!=0)
        {
            int rem = num%10;
            if(rem%2==0)
            {
                sume+=rem;
                
            }
            else
            {
                sumo+=rem;
            }
            num=num/10;
        }
        System.out.println(sume+" "+sumo);
     sc.close();
    }
}
