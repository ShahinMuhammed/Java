class CPU
{
	int price;
	CPU(int Prc)
	{
		price=Prc;
	}
	class Processor
	{
		int cores;
		String manufacture;
		Processor(int n,String m)
		{
			cores=n;
			manufacture=m;
		}
		void display()
		{
			System.out.println("The number of cores is "+cores);
			System.out.println("Manufacture is "+manufacture);
		} 
	}
	static class Ram
	{
		int memory;
		String manufactured;
		Ram(int m,String manu)
		{
			memory=m;
			manufactured=manu;
		}
		void display()
		{
			System.out.println("Memory size "+memory);
			System.out.println("Manufactured by "+manufactured);
		} 
	}
	void display()
		{
			System.out.println("The price is "+price);
		} 
	public static void main(String[] args)
	{
		CPU obj=new CPU(20000);
		CPU.Processor obj2=obj.new Processor(3,"Apple");
		CPU.Ram obj3 =new Ram(128,"Samsung");
		obj.display();
		obj2.display();
		obj3.display();
	}
}