#include <iostream>  //preprocessor command
#include <string>
using namespace std; // noneed to write namespace again in out cout operation
int sum(int a,int b){
	return a+b;
}
int main()
{ // programs starts from main function

  // cout<<"Hello World Aniruddha"<<endl;
  // cout<<"Next line";
  // short a;
  // int b;
  // long int c;
  // long long d;
  // float score =45.32;
  // double score2 = 34.2;
  // long double score3 = 45.332;
  // cout<<"The score is  "<<score<<endl<<score2<<endl<<score3;
  // int a,b;
  // cout<<"Enter first number";
  // cin>>a;
  // cout<<"Enter the second numbers";
  // cin>>b;
  // cout << " Sum of a + b is " << a + b;

//  int age;
//  cout << "Enter your age" << endl;
//  cin >> age;
  // if(age>18){
  //   cout<<"You can vote ";
  // }
  // else{
  //   cout<<"You cannot vote";
  // }
  //  switch (age)
  //  {
//  case 12:
//    cout << "You are 12 years old ";
//    break;
//
//  default:
//    cout << "You are neither 12 nor 18 years old";
//    break;
//  }
//  int index = 0;
//  while(index<34){
//  	cout<<"We are at index number "<<index<<endl;
//  	index+=1;
//  }
//do{
//	cout<<"We are at index number : "<<index <<endl;
//	index+=1;
//}while(index<34);
//  return 0;
//	for(int i=0;i<10;i++){
//		cout<<"Value of i is "<<i<<endl;
//	}
//cout<<sum(4,2);
//int a[3] = {1,2,3};
//cout<<a[2];
//int marks[6];
//for(int i=0;i<5;i++){
//	cout<<"Enter the marks of "<<i<<"th student"<<endl;
//	cin>>marks[i];	
//}
//for(int i=0;i<5;i++){
//	cout<<"marks of "<<i<<"th student is "<<marks[i]<<endl;
////	cin>>marks[i];	
//}

//int arr2d[2][3]={
//{1,2,3},
//{4,5,6}
//};
//for(int i=0;i<2;i++){
//	for(int j=0;j<3;j++){
//		cout<<"Value at "<<i<<j<<" th index is "<<arr2d[i][j]<<endl;
//	}
//}
string name = "Aniruddha";
cout<<"The length of name is "<<name.length()<<endl;
cout<<"The name is "<<name <<endl;
cout<<"The name is "<<name.substr(2,4);
return 0;

}
