import java.util.ArrayList;

public class LaunchArrayList
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(44.5);
		al.add("Anil");
		al.add('t');
		al.add(true);
		
		//System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(0, 44);
		al2.addAll(al);
		System.out.println(al2);
		System.out.println(al2.contains(20));
		System.out.println(al2.containsAll(al));
		al2.add(10);
		System.out.println(al2);
		

	}

}
