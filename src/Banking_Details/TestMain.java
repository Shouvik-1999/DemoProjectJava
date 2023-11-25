package Banking_Details;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails c=new CustomerDetails();
		
		c.setID("351400");
		c.setName("Shouvik");
		c.setBalance(100000);
		System.out.println("*************CUSTOMER DETAILS**************");
		System.out.println("Name:     "+c.getName());
		System.out.println("ID:       "+c.getID());
		System.out.println("Balance:  "+c.getBalance());
		

	}

}
