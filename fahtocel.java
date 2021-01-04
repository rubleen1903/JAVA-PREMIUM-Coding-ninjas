import java.util.Scanner;
public class fahtocel {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        float far = sc.nextFloat ();
        //for integer output int cel = (5*(far-32))/9 
        // method 2 int cel = int((5.0/9)*(far-32))
        float cel = ((5.0f/9.0f)*((far)-32.0F));
        System.out.println(cel);
       sc.close();
    }
}
