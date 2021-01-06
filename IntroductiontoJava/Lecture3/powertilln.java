package IntroductiontoJava.Lecture3;
import java.util.Scanner;
public class powertilln{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int power=1;
        int i=1;        
        while(i<=b){
			power*=a;
            i+=1;
		}
		System.out.println(power);
		scan.close();
    }
}