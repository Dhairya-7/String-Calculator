import java.util.Scanner;
 
class Add{
    int total=0;
        Add(String str){
            if(str=="" || str==" "){
                System.out.println("0");
            }
            else{

            String[] arr=str.split(",");

            for(int i=0;i<arr.length;i++){
                // System.out.println(arr[i]+" abcd");
                int a=Integer.parseInt(arr[i]);
                total+=a;
                // System.out.println(a);
            }
                System.out.println(total);
            }
        }
}

public class StringCalculator
{
    public static void main(String[] args)
    {
        String str = "1,2";
        // String str="";
        // System.out.println(str);
        Add a=new Add(str); 
    }
}