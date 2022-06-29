import java.util.*;
import java.util.stream.*;
class StreamTest1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		System.out.println("First Arraylist with all even & odd no---"+l);
		System.out.println("Searching even No without STREAM----------------------");

		ArrayList<Integer> l1=new ArrayList<Integer>();

		for(Integer i1:l){
			if(i1%2==0){
				l1.add(i1);
			}
		}
		System.out.println("Second Arraylist with only even no-----"+l1);


System.out.println("Searching even No with STREAM----------------------");

		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());

		System.out.println("Second Arraylist with only even no-----"+l2);

	}
}
