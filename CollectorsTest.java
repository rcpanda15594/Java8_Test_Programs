import java.util.*;
import java.util.stream.*;
class CollectorsTest 
{
	public static void main(String[] args) 
	{
		List<Integer> li =new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);

		List<Integer> lis = li.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("Berfore Streaming a List ------->"+li);//[10,20,30,40]
		System.out.println("After Streaming to a List------->"+lis);//[100,400,900,1600]

		Set<Integer> set = li.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println("After Streaming to a Set--------------------->"+set); //[400, 1600, 100, 900]


	}
}
