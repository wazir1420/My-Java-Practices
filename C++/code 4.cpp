#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
	cout<<"Enter the value of Ath and Bth variable"<<endl;
	cin>>a>>b;
	cout<<"Before Conversion "<<a<<"\t"<<b<<endl;
	c=a;
	a=b;
	b=c;
	cout<<"After Conversion  "<<a<<"\t"<<b<<endl;
	return 0;
}
