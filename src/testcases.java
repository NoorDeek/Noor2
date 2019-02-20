import static org.junit.Assert.*;

import org.junit.Test;

public class testcases {
cart cart11;
	@Test
	public void test1() {
		//fail("Not yet implemented");
	cart11=new cart();
		int expCount=0;
		int act=cart11.getProductCount();
         assertTrue(act==expCount);		
	}
	
@Test
public void test2()
{
book myBook=new book();
myBook.price=127;
myBook.quantity=1;
myBook.name="Java Book";
cart11.addBook(myBook);
int expp1=127;
int accc1=cart.totalValue;
int expp2=1;
int accc2=myBook.quantity;
assertTrue(expp1==accc1);
assertTrue(expp2==accc2);

}
@Test
public void test3() {
	book myBook=new book();
	myBook.price=127;
	myBook.quantity=1;
	myBook.name="Java Book";
	cart11.addBook(myBook);
	
	book myBook1=new book();
	myBook.price=100;
	myBook.quantity=1;
	myBook.name="Web design Book";
	cart11.addBook(myBook);
	
	int expp1=227;
	int accc1=cart.totalValue;
	int expp2=2;
	int accc2=cart11.getProductCount();
	assertTrue(expp1==accc1);
	assertTrue(expp2==accc2);
	
}

}
