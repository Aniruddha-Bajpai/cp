#include <iostream>
using namespace std;
class Employee{
	public :
		int salary;
		string name;
		string empid;
		Employee(int salary ,string name ,string empid){
			this->salary=salary;
			this->name=name;
			this->empid=empid;
		}
		void setempbankpin(string empbankpin){
			this->empbankpin = empbankpin;
		}
		void setbankAccountnum(string bankaccountnum){
			this->bankaccountnum = bankaccountnum;
		}
		string getempbankpin(){
			return this->empbankpin;
		}
		string getbankaccountnum(){
			return this->bankaccountnum;
		}
		void display(){
			cout<<"Employee name : "<<this->name<<endl<<"Employee salary : "<<this->salary<<endl<<"Employee id : "<<empid<<endl;
		}
	private :
		string empbankpin;
		string bankaccountnum;
		
};
int main(){
	Employee aobj[5];
	string name ;
	string empid;
	int salary;
	for(int i=0;i<5;i++){
		cin>>name;
		cin>>empid;
		cin>>salary;
		Employee obj(salary,name,empid);
		aobj[i]=obj;
	}
	for(int i=0;i<5;i++){
		aobj[i].display();
	}
	cout<<obj.getbankaccountnum()<<endl;
	cout<<obj.getempbankpin();
	
	
}
