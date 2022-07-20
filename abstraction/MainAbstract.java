abstract class Bank
{
	abstract void getBalance(int bal);
}
class BankA extends Bank
{
    void getBalance(int bal)
    {
      System.out.println("Bank A balance:$"+bal);
    }
	
}
class BankB extends Bank
{
    void getBalance(int bal)
    {
      System.out.println("Bank B balance:$"+bal);
    }
	
}
class BankC extends Bank
{
    void getBalance(int bal)
    {
      System.out.println("Bank C balance:$"+bal);
    }
	
}
class MainAbstract
{
	public static void main(String Arg[])
	{
		BankA a=new BankA();
		a.getBalance(100);
		BankB b=new BankB();
		b.getBalance(150);
		BankC c=new BankC();
		c.getBalance(200);
	}
}
