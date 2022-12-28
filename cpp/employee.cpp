#include<iostream>
#include<string>
using namespace std;
class Employee{
	 	public :
		 string name;
		 int salary;
		 Employee(string name,int salary,int secretPassword){
		 	this->name = name;
		 	this->salary = salary;
		 	this->secretPassword = secretPassword;
		 }
		 void printDetails(){
		 	cout<<"the name of our first employee is "<<this->name;
		 }
		 void getsecretPassword(){
		 	cout<<"The secret of password of employee is "<<secretPassword<<endl;
		 }
		private:
			int secretPassword;
			
};
//inheritance
class Programmer : public Employee {
	public:
		int errors;
};

int main(){
	Employee ana("aniruddha constructor",342,1234);
//	ana.name = "aniruddha";
//	ana.salary = 100;
		ana.printDetails();
		ana.getsecretPassword();
}

 	
