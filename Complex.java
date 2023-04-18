class Complex
{
	int real,image;

	public Complex(int r,int i)
	{
		this.real = r;
		this.image = i;

	}
	public void Show()
	{
	System.out.println(this.real+" +i" + this.image);
	}

	public Complex add(Complex n1,Complex n2)
	{
	Complex res = new Complex(0, 0);
	res.real = n1.real + n2.real;
	res.image = n2.image + n2.image;
	return res;
	}

	public static void main(String args[])
	{
	Complex c1 = new Complex(4,5);
	Complex c2 = new Complex(2,3);
	System.out.println("First complex number");
	c1.Show();
	System.out.println("Second complex number");
	c2.Show();
	Complex res = add(c1,c2);

	System.out.println("Result of addition");
	res.Show();
	}
}
