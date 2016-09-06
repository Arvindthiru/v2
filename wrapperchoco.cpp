include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,c,m,sum=0;
	int n1,c1,m1;
	
	cin>>n>>c>>m;
	
	n1=n/c;
	sum=n1;
	
	while(n1>=m)
	{
	    c1=n1/m;
	    m1=n1%m;
	    n1=c1+m1;
	    sum=sum+c1;
	    
	}
	cout<<sum;
	return 0;
}
