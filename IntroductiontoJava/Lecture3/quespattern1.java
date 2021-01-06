package IntroductiontoJava.Lecture3;

import java.util.Scanner;
public class quespattern1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
		int num = sc.nextInt();
        int i=0;
      
        while(i<num)
        {    int j =1;
            while(j<=i+1)
            {
                System.out.print(j+i);
                System.out.print(" ");
                j+=1;
            }
            
            System.out.println();
            i+=1;
        }
        sc.close();
	}

}

