#include<iostream>
using namespace std;
int main()
{
	int a,b;
	cout<<"Enter the value of Ath and Bth Variable "<<endl;
	cin>>a>>b;
	cout<<"Before Conversion "<<a<<"\t"<<b<<endl;
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<"After Conversion  "<<a<<"\t"<<b<<endl;
	return 0;
}
