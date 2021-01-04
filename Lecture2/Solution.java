import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
 String nm= s.next();
 char c= nm.charAt(0);
 int m1= s.nextInt();
 int m2= s.nextInt();
 int m3= s.nextInt();
 int avg=(m1+m2+m3)/3;
 System.out.println(c);
 System.out.print(avg);
	s.close();	
	}

}
