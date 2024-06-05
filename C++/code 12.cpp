#include<iostream>
using namespace std;
int main(){
	double numbers[6] = {3,4,5,6,7,8};
	double sum = 0;
	double count =0;
	double average;
	cout << "The numbers are : ";
	for(int n=0; n<=5; ++n)
	{
		cout << numbers[n] <<" ";
		sum+=numbers[n];
		++count;
	}
	cout << "\n Their Sum is: " <<sum<<endl;
	average = sum/count;
	cout <<"Their Average ="<<average<<endl;
	
	return 0;
}
