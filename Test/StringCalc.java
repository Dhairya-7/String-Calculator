
public class StringCalc {
	public class negativeNumberException extends Exception{
		negativeNumberException(String msg){
			super(msg);
		}
	}	
	public int calc(String string) {
		int total=0;
		String delim="[,\\n]";
		
		if(!string.isEmpty())
		{				
			if(string.startsWith("//")) {
				String newDelim=string.substring(string.indexOf("//")+2,string.indexOf("\n"));
                string=string.substring(string.indexOf("\n")+1,string.length());
                delim=newDelim;
			}
			
			String [] arr =string.split(delim);
		
			for(int i=0;i<arr.length;i++)	
			{
				if(arr[i].isEmpty()){
                    continue;
                }
                int a=Integer.parseInt(arr[i]);
                if(a<0) {
                	try{
                		
                		throw new negativeNumberException("Can't add Negative Number");
                	}
                	catch(negativeNumberException e) {
                		System.out.println( e.getMessage());
                		return 0;
                	}
                }
                total+=a;
            } 
			return total;
			}
		return 0;			
	}
	

}
