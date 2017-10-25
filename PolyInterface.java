public interface PolyInterface 
{
		public int degree();
		public int getCoefficient(int power);
		public void changeCoefficient(int newCoef, int power);
		public String toString();
		public Polynomial add(); 

}
