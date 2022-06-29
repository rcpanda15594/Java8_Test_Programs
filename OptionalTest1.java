import java.util.*;
class OptionalTest1 
{
	public static void main(String[] args) 
	{

		String[] s=new String[5];
		s[0]="ram";
		s[1]="shyam";

		System.out.println("s[1]------------"+s[1]);   //s[1]------------shyam
		System.out.println("s[2]------------"+s[2]);   //s[2]------------null
		System.out.println("s[1]------------"+s[1].toUpperCase());  //s[1]------------SHYAM
	//	System.out.println("s[2]------------"+s[2].toUpperCase());  //NullPointerException


		Optional<String> o1=Optional.ofNullable(s[1]);
		System.out.println("O1-------------"+o1);   //O1------------Optional[shyam]
		System.out.println("O1.isPresent()-------------"+o1.isPresent()); //O1.isPresent()-------------true
System.out.println("---------------------------------------------------------------------");
		Optional<String> o2=Optional.ofNullable(s[2]);
		System.out.println("O2-------------"+o2);    //O2-------------empty
		System.out.println("O2.isPresent()-------------"+o2.isPresent()); //O2.isPresent()----------false

System.out.println("---------------------------------------------------------------------");

		if(o1.isPresent()){
		System.out.println("Value existed-------------"+o1.get()+"----o1.get().toUpperCase()--------------"+o1.get().toUpperCase());
		}else{
		System.out.println("Value is not existed");	
		}//Value existed-----------shyam----o1.get().toUpperCase()---------SHYAM

System.out.println("---------------------------------------------------------------------");

		if(o2.isPresent()){
		System.out.println("Value existed-------------"+o2.get()+"----o2.get().toUpperCase()--------------"+o2.get().toUpperCase());
		}else{
		System.out.println("Value is not existed");	
		}//Value is not existed
	}
}
