import java.util.*;
import java.util.stream.*;
class Book
{
	String bname;
	double bprice;
	long bpage;
	int nbooks;

	public Book(String bname,double bprice,long bpage,int nbooks){
		super();
		this.bname = bname;
		this.bprice = bprice;
		this.bpage = bpage;
		this.nbooks = nbooks;
	}
	
	@Override
	public String toString(){
		return bname+"-----"+bprice+"-----"+bpage+"------"+nbooks;
	}
}

class  CollectorsTest2
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("corejava",2500,250,3);
		Book b2 = new Book("advjava",3500,300,2);


		List<Book> bo = new ArrayList<Book>();
		bo.add(b1);
		bo.add(b2);
		System.out.println("Books Details----->"+bo);


		long noBook = bo.stream().collect(Collectors.counting());
		System.out.println("Total No Of Books------->"+noBook);
		
		int  totalBook = bo.stream().collect(Collectors.summingInt((p)->p.nbooks));
		System.out.println("Total Amount------->"+totalBook);

		double  amount = bo.stream().collect(Collectors.summingDouble((p)->p.bprice));
		System.out.println("Total Amount------->"+amount);

		long  pages = bo.stream().collect(Collectors.summingLong((p)->p.bpage));
		System.out.println("Total Pages------->"+pages);


	}
}
