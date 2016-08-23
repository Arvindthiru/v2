import java.util.*;

class Tokeni{

public static void main(String args[])
{
int i,a;
String s="12 56 78 78";
//System.out.println(s.charAt(0));
String s1[]=s.split(" ");
//int a=Integer.parseInt(s1[0]);
//int b=int(s1[1]);
//System.out.println(a);

for(i=0;i<4;i++)
{
 a=Integer.parseInt(s1[i]);
System.out.println(a);
}
}
}
