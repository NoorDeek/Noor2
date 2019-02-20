import java.util.ArrayList;

public class cart {
	
static int totalValue;
	
		static ArrayList<book> cart1;

	public cart() {
		
		 cart1=new ArrayList<book>();
		 totalValue=0;
		
	 //cart  cart1=new cart(A);
	}

	public int getProductCount() {
		
		return cart1.size();
	}

	public static void addBook(book myBook) {
	
	
		cart1.add(myBook);
		totalValue=0;
		for(int i=0;i<cart1.size();i++)
		{
		 totalValue+=(cart1.get(i).price *cart1.get(i).quantity);
		
		}
		
	}



	

	
	
	

	}



