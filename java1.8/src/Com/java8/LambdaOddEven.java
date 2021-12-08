package Com.java8;
interface OddEven
{
	public void check(int n);
}

public class LambdaOddEven {

	public static void main(String[] args) {
		
		OddEven OE=(int n)->{
			if(n%2==0)
			{
				System.out.println("Given number is Even ");
			}
			else
			{
				System.out.println("Given number is Odd");
			}
		};
		OE.check(11);

	}

}
