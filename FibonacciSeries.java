package Week1.Day1.Assignments;

public class FibonacciSeries {
	public static void main(String args[])  
	{    
		
		 int v1=0,v2=1,v3,i,count=20;    
		 System.out.print(v1+" "+v2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  v3=v1+v2;    
		  System.out.print(" "+v3);    
		  v1=v2;    
		  v2=v3;    
		 }    
		  
		}
}
