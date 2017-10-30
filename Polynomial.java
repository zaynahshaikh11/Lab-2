public class Polynomial implements PolyInterface
{
	private int coefficient[];
	
	// Returns the degree of the polynomial.
	public int degree()
	{
		return coefficient.length;
	}
	
	// Polynomial constructor
	public Polynomial(int a, int b, int c) 
	{
		coefficient = new int[3];
		coefficient[0] = a;
		coefficient[1] = b;
		coefficient[2] = c;
	}
	
	// Returns the coefficient of the polynomial at that power.
	public int getCoefficient(int power)
	{
		return coefficient[power];
	}
	
	// Replaces the coefficient at the power with a new coefficient.
	public void changeCoefficient(int newCoef, int power) 
	{
		coefficient[power] = newCoef;
	}
	
	// Method for adding the two polynomials together.
	public Polynomial add(Polynomial append)
	{
		// result2 is used to store the result of the added polynomials.
		Polynomial result2 = new Polynomial(
				getCoefficient(0) + append.getCoefficient(0),
				getCoefficient(1) + append.getCoefficient(1),
				getCoefficient(2) + append.getCoefficient(2)
				) ;
		return result2;
	}
	

	public String toString() 
	{
		String result = "";
		for (int i = coefficient.length-1; i >=0; i= i-1)
		{
			
			result = result + ((i == coefficient.length - 1)?"":"+") + coefficient[i];
			if (i == 1)
			{
				result += "x" + " ";
			}
			else if (i != 0)
			{
				result += "x" + "^" + i + " ";
			}
			
		}
		return result;
	}
	
	// Creating the polynomials, converting them to Strings, and adding them together.
	public static void main (String[] args)
	{
		Polynomial poly1 = new Polynomial (2, 3, 4);
		Polynomial poly2 = new Polynomial(-1,4,5);
		System.out.println(poly1.toString());
		System.out.println(poly2.toString());
		System.out.println(poly1.add(poly2));
	}

}














