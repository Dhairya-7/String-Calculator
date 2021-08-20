 class Add{
    int total=0;
        Add(String str){
            String delim="[,\\n]";

            if(!str.isEmpty()){

                if(str.startsWith("//")){
                    String newDelim=str.substring(str.indexOf("//")+2,str.indexOf("\n"));
                    str=str.substring(str.indexOf("\n")+1,str.length());
                    delim=newDelim;
                }
                System.out.println("Delimiter is : " + delim);

                String[] arr=str.split(delim) ;
            
            for(int i=0;i<arr.length;i++){
                if(arr[i].isEmpty()){
                    continue;
                }
                int a=Integer.parseInt(arr[i]);
                total+=a;
                // System.out.println(a);
            }              
            System.out.println("Total is : " + total);
            
            }
            else
            {
                    System.out.println("0");
            }
        }
}

public class StringCalculator
{
    public static void main(String[] args)
    {
        String str = "//;\n1;2";
        // String str="1\n2,3";
        // System.out.println(str);
        Add a=new Add(str); 
    }
}