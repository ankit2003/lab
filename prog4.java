import java.util.Scanner;
class LessBalanceException extends Exception
{
	String s1;
	public LessBalanceException(String s2)
	{
		s1=s2;
	}
	@Override
	public String toString()
	{
		return("Less Balance Exception "+s1);
	}
}
class TransactionNotAllowed extends Exception
{

	String s1;
	public TransactionNotAllowed(String s2)
	{
		s1=s2;
	}
	@Override
	public String toString()
	{
		return("TransactionNotAllowed "+s1);
	}	
}
class Axis
{
	String name,address,pan,aadhar;
	int accountno;
	double balance;
	public Axis(String name,String address,String pan,String aadhar,int accountno,double balance)
	{
		this.name=name;
		this.address=address;
		this.pan=pan;
		this.aadhar=aadhar;
		this.accountno=accountno;
		this.balance=balance;
	}
	public void addbalance(double a)
	{
		balance=balance+a;
		System.out.println("New Balance="+balance);
	}
	public void withdraw(double amt)
	{
		try
		{
			if(amt>4500)
				throw new TransactionNotAllowed("\n Cannot withdraw more than 4500");
			
			else if(balance-amt<1000)
				throw new LessBalanceException("\n Balance must remain 1000 minimum");
			else
			{
				balance=balance-amt;
				System.out.println("Amount withdrawn");
			}
		}
		catch(TransactionNotAllowed e)
		{
			System.out.println(e);
		}
		catch (LessBalanceException e)
		{
			System.out.println(e);
		}

	}
	public void details()
	{
		System.out.println("Name:"+name);
		System.out.println("Address"+address);
		System.out.println("Pan:"+pan);
		System.out.println("Aadhar:"+aadhar);
		System.out.println("Balance:"+balance);
		System.out.println("Account number:"+accountno);
	}
}
class prog4
{
	public static void main(String args[])
	{
		Axis t=new Axis("Parusha","baneshwor","991234345","12345678",110,5000);
		int choice=0;
		double amount;
		while(choice!=4)
		{
			System.out.println("\n MENU\n 1.Add balance\n 2.Withdraw Amount\n 3.Details \n 4.Exit\n");
			Scanner s1=new Scanner(System.in);
			choice=s1.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the amount to be added \n");
					amount=s1.nextDouble();
					t.addbalance(amount);
					break;
				case 2:
					System.out.println("Enter the amount to be withdrawn");
					amount=s1.nextDouble();
					t.withdraw(amount);
					break;

				case 3:
					t.details();
					break;
				case 4:
					return;

			}

		}
	}
}