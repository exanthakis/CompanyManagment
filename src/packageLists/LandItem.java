//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package packageLists;

import package1.Land;

public class LandItem extends Item {
	
	private Land h;
	
	/**
	 * 
	 */
	
	public LandItem(Land s)
	{
		h=s;
	}
	
	/**
	 * 
	 */
	
	public Object key() { 
		return h.getLandAddress(); 
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
	
	public Land getKey() {
		return h;
	}

	/**
	 * 
	 */
	
	public void setKey(Land m) {
			this.h = m;
	}
	
	/**
	 * 
	 */
	
	public void print(){
		h.printLandData();
    }
	
	/**
	 * 
	 */		
	
}
