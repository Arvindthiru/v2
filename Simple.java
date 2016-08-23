    import java.util.*;  
    public class Simple
{  
     public static void main(String args[])
	{  
       StringTokenizer st = new StringTokenizer("my name  is-khan?hello,hi","  , ,-,?,");  
	 //StringTokenizer st2 = new StringTokenizer("my name  is-khan?hello,hi","  , ,-,?,");  
	ArrayList<String> a=new ArrayList<String>();
	int i=0;
	int count=0;
         while (st.hasMoreTokens()) 
	{  
		//count++;
		a.add(st.nextToken());	
        }  
	  
	for(i=0;i<a.length;i++)
	{
		  System.out.println(a[i]); 
	}
        }  
}  
