//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public class LendingBuilding extends Building {

	/*member variables*/
	
	protected float priceForLend;
	protected int expiryYear;
    
	public LendingBuilding() {		
        
    } 
	
    /**
	  * class constructor that will be used by the derived classes
	  */
  
    public LendingBuilding (String lAddress,float Area,float price, int eYear) {
	
    	super(lAddress,Area);
    	priceForLend=price;
    	expiryYear=eYear;
	
    }
	
    /**
	 * 
	 */
	
	/* set methods */

    /**
	 * 
	 */

	public void setPriceForLend(float price) {
		priceForLend = price;
	}
	
	/**
	 * 
	 */
	
	public void setExpiryYear(int eYear) {
		expiryYear = eYear;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public float getPriceForLend() {
		return priceForLend;
	}
	
	/**
	 * 
	 */
	
	public int getExpiryYear() {
		return expiryYear;
	}
	
	/**
	 * 
	 */

	public void printLandData(){
		System.out.println("\nLending Building Address : " + " "+landAddress);
		System.out.println("Lending Building Surface (in sqr mtrs): " + area);
		System.out.println("Price for Rent : " + priceForLend);
		System.out.println("Expiration Year of Contract Rental Building: " + expiryYear);

	}
	
	/**
	 * 
	 */
	
}