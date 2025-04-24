
public class Complex {
	
	private double real;
	private double img;
	
	public Complex(double real, double img)
	{
		setReal(real);
		setImg(img);
	}
	public double getReal()
	{
		return real;
	}
	public void setReal(double newReal)
	{
		real = newReal;
	}
	public double getImg()
	{
		return img;
	}
	public void setImg(double newImg)
	{
		img = newImg;
	}
	public void printNumber()
	{
		System.out.print("The complex number is " + getReal() + "+ " +  getImg()+"i" );
	}
	public double computeAbsNumber()
	{
		return Math.pow(Math.pow(real,2) + Math.pow(img,2),0.5);
	}

}
