/**
* @author James Whiteman
* 
* This class represents a customer that is a business, not a necessarily single person.
*/

import java.util.List;

public class BusinessCustomer extends Customer
{
	private int size;

	/**
	* Constructor setting the name and size, representing number of employees.
	*/
	public BusinessCustomer(String name, int size)
	{
		super(name);
		this.size = size;
	}

	/**
	* @return the number of employees of the business.
	*/
	public int getSize()
	{
		return size;
	}
}