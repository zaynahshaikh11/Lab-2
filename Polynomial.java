public class Polynomial implements PolyInterface
{
	private int coefficient[];
	private int power[];
	
	public int degree()
	{
		return power.length-1;
	}
	
	public int getCoefficient(int power)
	{
		return coefficient[power];
	}
	
	public void changeCoefficient(int newCoef, int power) 
	{
		coefficient[power] = newCoef;
	}
	
	public Polynomial add()
	{
		return null;
		
	}
	
	public String toString()
	{
		String result = "";
		for (int i = power.length-1; i >=0; i= i-1)
		{
			result = result + coefficient[i] + "x" + power[i] + " ";
		}
		return result;
	}

}







