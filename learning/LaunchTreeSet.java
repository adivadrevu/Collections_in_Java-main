import java.util.TreeSet;

public class LaunchTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts=new TreeSet();
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		//ts.add(125);
		//System.out.println(ts);
		
		System.out.println(ts.ceiling(50));//50
		System.out.println(ts.higher(50));//75
		
		System.out.println(ts.floor(50));//25 //50
		System.out.println(ts.lower(50));//25 //25
		
		System.out.println(ts.tailSet(75));//75, 100, 125, 150, 175
		System.out.println(ts.headSet(75));//25, 50
	}

}
