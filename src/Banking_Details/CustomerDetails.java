package Banking_Details;

public class CustomerDetails {
	private String name;
	private String ID;
	private float balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public float returnBalance(int amount) {
		balance=balance-amount;
		return balance;
	}
	
}
