import java.util.Scanner;
 
public class StringCalculator
{
    public static void main(String[] args)
    {
        String str = "1,2";
        System.out.println(str);
        int add=0;

        String[] arr=str.split(",");

        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]+" abcd");
            int a=Integer.parseInt(arr[i]);
            add+=a;
            // System.out.println(a);
        }
            System.out.println(add);
        
    }
}