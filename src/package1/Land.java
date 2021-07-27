//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public abstract class Land {

	/*member variables*/
	
	protected String landAddress;
	protected float area;
	
	public abstract void printLandData();
	
	/**
	  * default class constructor, ie. constructor without arguments
	  */
 
    public Land() {		
    
    } 
	
    /**
	  * class constructor that will be used by the derived classes
	  */
 
    public Land (String lAddress, float Area) {
	   
    	landAddress=lAddress;
    	area=Area;
	   
    }
	
    /* set methods */
	
    /**
	 * 
	 */
    
	public void setLandAddress(String lAddress) {
		landAddress = lAddress;
	}
	
	/**
	 * 
	 */
		
	public void setArea(float f) {
		area = f;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public String getLandAddress() {
		return landAddress;
	}	
	
	/**
	 * 
	 */
	
	public float getArea() {
		return area;
	}
	
	/**
	 * 
	 */
	
}
