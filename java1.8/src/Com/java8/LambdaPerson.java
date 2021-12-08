package Com.java8;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Person
{
	private String name;
	private String lname;
	private int age;
	
	@Override
	public String toString() 
	{
		return "Person [name=" + name + ",  name="+lname+" age=" + age + "]";
	}
	
	
	public Person(String name, String lname, int age) {
		super();
		this.name = name;
		this.lname = lname;
		this.age = age;
	}


	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLanme() 
	{
		return lname;
	}
	public void setLanme(String lanme)
	{
		this.lname = lanme;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
}

public class LambdaPerson {

	public static void main(String[] args) 
	{
	
	 Person Bhavana=new Person("Bhavana","y",10);
	 Person Bhavi=new Person("Bhavi","a",20);
	 Person Ram=new Person("Ram","b",30);
	 Person Kavana=new Person("Kavana","g",40);
	 
	 List<Person>personlist=new ArrayList<Person>();
	 personlist.add(Bhavana);
	 personlist.add(Bhavi);
	 personlist.add(Ram);
	 personlist.add(Kavana);
	 System.out.println(personlist);
	 
	 
	 
	 
	 

	}

}