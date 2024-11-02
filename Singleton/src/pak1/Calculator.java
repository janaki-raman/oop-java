package pak1;

public class Calculator 
{
	private static Calculator calci=new Calculator();
	
	private Calculator(){}
	
	public static Calculator getcalci()
	{
		return calci;
	}

}
