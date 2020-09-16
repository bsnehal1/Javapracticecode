
class Snehal<T extends Number>
{
	T value;
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
}


public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Snehal<Integer> obj=new Snehal<>();
		obj.value=9;
		obj.show();

	}

}
