package Com.java8;
interface lam
{
	public String Say(String name);
}

public class Lambda {

	public static void main(String[] args) 
	{
	   lam l1=(name)->{return "hello," +name;	

	};
	System.out.println(l1.Say("Aris"));
	
	}

}
