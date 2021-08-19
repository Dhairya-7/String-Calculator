
public class StringCalc {
	public class negativeNumberException extends Exception{
		negativeNumberException(String msg){
			super(msg);
		}
	}	
	public int calc(String string) {
		int total=0;
		
		if(!string.isEmpty())
		{				
			String [] arr =string.split("[,\\n]");
		
			for(int i=0;i<arr.length;i++)	
			{
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
