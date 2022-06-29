import java.util.*; 
import java.util.stream.*;
class OfMethodExample 
{
	public static void main(String[] args) 
	{
		String[] s ={"b","a","c"};
		Stream<String> s1=Stream.of(s);
		//System.out.println("Stream Count---"+s1.count());//Stream Count---3

		//s1.forEach((x)->{System.out.println(x);});
		Stream<String> s2=s1.sorted();
		s2.forEach((x)->{System.out.println(x);});

		Stream<Integer> l = Stream.of(new Integer[]{10,25,20,35,30});
		System.out.println(l);
		Stream<Integer> s3=l.sorted();
		Object[] o = s3.toArray();
		for(Object o1:o){
			System.out.println("Unreferenced Array-------"+o1);
		}

		Stream<String> s4 = Stream.of("bbc","abc","cbc");
		System.out.println("Var Arg Example-----"+s4.count());
	}
}
