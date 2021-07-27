//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public class CompanyBuilding extends Building {

	/*member variables*/
	
	protected int valueOfBuildings;
	 
	/**
	 * default class constructor, ie. constructor without arguments
	 */
   
	public CompanyBuilding() {		
        
    } 
	
    /**
	 * class constructor that will be used by the derived classes
	 */
 
    public CompanyBuilding (String lAddress, float Area,int value) {
	
    	super(lAddress,Area);
    	valueOfBuildings=value;
	   
    }
    
    /**
	 * 
	 */
	
	/* set methods */
	
    /**
	 * 
	 */
    
	public void setValueOfBuildings(int value) {
		valueOfBuildings = value;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public int getValueOfBuildings() {
		return valueOfBuildings;
	}
   
	/**
	 * 
	 */

	public void printLandData(){
		System.out.println("\nCompany's Building Address: " + " "+landAddress);
		System.out.println("Company's Building Surface (in sqr mtrs): " + area);
		System.out.println("Company's Building Value: " + valueOfBuildings);
	
	}

	/**
	 * 
	 */
	
}