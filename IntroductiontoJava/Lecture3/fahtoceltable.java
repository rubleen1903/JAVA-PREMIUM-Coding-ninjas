package IntroductiontoJava.Lecture3;
import java.util.Scanner;
public class fahtoceltable {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);
      int farstart = sc.nextInt();
      int farend = sc.nextInt();
      int step = sc.nextInt();
      int i = farstart;
    while(i<=farend)
    {
        int cels=(int)((5.0/9)*(i-32));
        System.out.println(i+" "+cels);
        i+=step;
    }
    sc.close();

    }
}
