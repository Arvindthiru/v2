    import java.util.*;  
    public class Simple1
{  
     public static void main(String args[])
	{  int n,sum=0,m;
		String s=new String();
		Scanner s1=new Scanner(System.in);
		
		s=s1.nextLine();//Always use next line for a full line of string with spaces
		//n=s.length();
       StringTokenizer st = new StringTokenizer(s," ,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z");  
	 //StringTokenizer st2 = new StringTokenizer("my name  is-khan?hello,hi","  , ,-,?,");  
	//System.out.println(n);
	ArrayList<String> a=new ArrayList<String>();
	int i=0;
	//int count=0;
         while (st.hasMoreTokens()) 
		{  
		//count++;
		a.add(st.nextToken());
        }  
	 // System.out.println(a.size());
	for(i=0;i<a.size();i++)
	{
		//System.out.println(a.get(i));
		m=Integer.parseInt(a.get(i));
		//System.out.println(m);
		  sum=sum+m; 
	}
	System.out.println(sum);
        }  
}