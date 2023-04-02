class Complex	
{
	int real,image;
	Complex(int r,int i)
	{
		this.real=r;
		this.image=i;
	}
	Complex add(Complex other)
	{
		int sumreal=this.real+other.real;
		int sumimage=this.image+other.image;
		return new Complex(sumreal,sumimage);
	}
	public static void main(String[] args)
	{
		Complex n1= new Complex(2,3);
		Complex n2= new Complex(4,5);
		Complex result= n1.add(n2);
		System.out.println("Sum : "+result.real+" + "+result.image+"i");
	}
}