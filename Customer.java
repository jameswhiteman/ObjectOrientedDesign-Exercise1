/**
* @author James Whiteman
* 
* Covers the shared traits of the human and business customers.
*/

public abstract class Customer
{
	private String name;

	/**
	* Constructor, assigning the name of the customer.
	*/
	public Customer(String name)
	{
		this.name = name;
	}

	/**
	* @return the name of the customer.
	*/
	public String getName()
	{
		return name;
	}
}