
public class sneexcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new Myexception(5);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}

class Myexception extends Exception
{
	
	int a;
	Myexception(int b)
	{
		a=b;
	}
	public String toString()
	{
		return("Exception Number = "+a);
	}
	
}
