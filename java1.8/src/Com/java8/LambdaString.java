package Com.java8;

interface StringLength
{
	int getLength(String str);
}
public class LambdaString {

	public static void main(String[] args)
	{
	   StringLength st=(String str)->str.length();
	   int length=st.getLength("ArisGlobal");
	   System.out.println("length= "+length);

	}

}
