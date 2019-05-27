class bank
{
	String name,address,phone,pan,aadharno;
	public bank(String a,String ad,String p,String ph,String ano)
	{
		name=a;
		address=ad;
		phone=p;
		pan=ph;
		aadharno=ano;

	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Phone="+phone);
		System.out.println("Pan="+pan);
		System.out.println("Aadhar no="+aadharno);

	}
	void calintest()
	{} 	

}
class loan extends bank
{
	String accno,acctype;
	double interest,balance;
	public loan(String accno,String acctype,double balance,String name,String address,String phone,String pan,String aadharno)
	{
		super(name,address,phone,pan,aadharno);
		this.accno=accno;
		this.acctype=acctype;
		this.balance=balance;
	}

		void calintest()
		{
			interest=balance *0.04;
		}

		void details()
		{
			super.display();
			System.out.println("Account type=Loan");
			System.out.println("Account no="+accno);
			System.out.println("Interest="+interest);
			
			System.out.println("");
		}
	}

class saving extends bank
{

	String accno,acctype;
	double interest,balance;
	public saving(String accno,String acctype,double balance,String name,String address,String phone,String pan,String aadharno)
	{
		super(name,address,phone,pan,aadharno);
		this.accno=accno;
		this.acctype=acctype;
		this.balance=balance;
		this.accno=accno;
		
	}

		void calintest()
		{
			interest=balance *0.04;
		}
		
		void details()
		{
			super.display();
			System.out.println("Account type=Saving");
			System.out.println("Account no="+accno);
			System.out.println("interest="+interest);
			System.out.println("");
		}
	}
class prg1
{
		public static void main(String[] args)
		{
			saving s1=new saving("111111","Saveing",100000,"Parusha","923211223","1223432213213","23343224323434","232323");
			s1.calintest();
			s1.details();
			loan l1=new loan("111111","Saveing",120000,"Parusha","923211223","1223432213213","23343224323434","23343243");
			l1.calintest();
			l1.details();
		}
}