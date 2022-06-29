import java.util.*;
import java.util.stream.*;
class TestCollectors1
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);li.add(20);li.add(30);li.add(40);
		System.out.println("First List--->"+li);

		//List<Integer> li1 = li.stream().map(x->x*x).collect(Collectors.toList());
		//System.out.println("After Collectors List--->"+li1);

		Set<Integer> s1 = li.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("After Collectors Set--->"+s1);
		
	}
}
