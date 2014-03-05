/**
* @author James Whiteman
* 
* This class encapsulates a single human character.
*/

import java.util.List;

public class HumanCustomer extends Customer
{
	private HumanCustomer spouse;
	private List<HumanCustomer> children;

	/**
	* Constuctor setting the name, spouse, and children for the human customer.
	*/
	public HumanCustomer(String name, HumanCustomer spouse, List<HumanCustomer> children)
	{
		super(name);
		this.spouse = spouse;
		this.children = children;
	}

	/**
	* @return the spouse of the human customer.
	*/
	public HumanCustomer getSpouse()
	{
		return spouse;
	}

	/**
	* @return the list of children of the customer.
	*/
	public List<HumanCustomer> getChildren()
	{
		return children;
	}
}