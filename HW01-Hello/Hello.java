// CSE1102 Program 1
// Spring 2013
// William Dickson
public class Hello
{
	public static void main(String[] args)
	{
		
		Double x = new Double(123.324);
		String y = new String("Hi");
		
		String tempString;
		tempString = new String("BLARG");
		
		Ball b1 = new Ball("red",20);
		String color = b1._color;
		double size = b1._size;
		
		double bounce = b1.bounce(2);
		
		System.out.println(bounce);
	}
}