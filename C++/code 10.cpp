#include <iostream>
using namespace std;
int main(){
	int numbers[5] = {4, 5, 6, 7, 8};
	//cout << "The numbers are: ";
	//for(const int &n ; numbers){
	//	cout <<n<< " ";
	//}
	
	cout <<"\n The numbers are: ";
	for(int i=0; i<5; i++){
		cout<<numbers[i]<<" ";
	}
	return 0;
}
