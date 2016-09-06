#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int i,n,l,sum,j;
	string s[100];
	cin>>n;
	for(i=0;i<n;i++)
	{   
	    int v1=0;
	    string a="";
	    cin>>s[i];
	    a=a+s[i];
	    sum=a.length();
	    int k;
	    
	    for(l=0;l<(a.length())-1;l++)
	    {
	        k=0;
	    for(j=l+1;j<a.length();j++)
	    {   
	        
	      if(a[k]==a[j])
	        {
	            v1++;
	        }
	        else
	        {
	            break;
	        }
	        
	        k++;
	    }
	    
	    sum=sum+v1;
	    v1=0;
	    }
	    cout<<sum<<endl;
	}

	return 0;
}
