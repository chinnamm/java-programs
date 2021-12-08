package Com.java8;
interface lam1
{
	public void square(int num);
}

public class LambdaSquare {

	public static void main(String[] args)
	{
		lam1 l1=n->System.out.println("Square of the given Number is: "+n*n);
		
		l1.square(9);

	}

}
