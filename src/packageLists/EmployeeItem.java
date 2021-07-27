//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package packageLists;

import package1.Employee;

public class EmployeeItem extends Item {

	private Employee h;
		
	/**
	  * Class constructor
	  */
		
	public EmployeeItem(Employee s)
	{
		h=s;
	}
		
	/**
	 * 
	 */
		
	public Object key() { 
		return h.getEmployerFirstName(); 
	}
		
	/**
	 * 
	 */
			
	public boolean equals(Item o) {
		return key().equals( (String)o.key()); 
	}
	
	/**
	 * 
	 */

	public boolean less(Item o) {
		if ( ((String)key()).compareTo( (String)o.key() ) < 0)    return true;
	        return false;
	}
	
	/**
	 * 
	 */
	
	public String toString() {  
		return h.toString(); 
	}
	
	/**
	 * 
	 */
	
	public void print(){
	    h.printEmployerData();
	}

	/**
	 * 
	 */
	
	public Employee getKey() {
		return h;
	}

	/**
	 * 
	 */
	
	public void setKey(Employee m) {
		this.h = m;
	}
		
	/**
	 * 
	 */		
		
}

