import java.util.*;
import java.util.stream.*;
class DistnictMethodTest 
{
	public static void main(String[] args) 
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(5);
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(33);
		System.out.println("li-------------->"+li);

		Stream<Integer> s=li.stream();
		/*Object[] o=s.toArray();
		for(Object o1:o){
			System.out.println(o1);
		}*/

		Stream<Integer> s1=s.distinct();
		/*Object[] o=s1.toArray();
		for(Object o1:o){
			System.out.println(o1);
		}*/

		Stream<Integer> s2=s1.limit(3);
		/*Object[] o=s2.toArray();
		for(Object o1:o){
			System.out.println(o1);
		}*/

		Stream<Integer> s3=s2.peek((x)->{
		 System.out.println(x+"-------------------"+(x*x));
		});
		s3.count();

		//-----------All methods in One Line------------------

		li.stream().distinct().limit(3).peek((x)->{
		 System.out.println(x+"-------------------"+(x*x));
		}).count();
		
	}
}
