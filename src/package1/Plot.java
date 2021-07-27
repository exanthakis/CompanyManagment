//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public class Plot extends Land {

    /*member variables*/
	
	protected float factorOfPlot;
	
    
	/**
	  * default class constructor, ie. constructor without arguments
	  */

    public Plot() {		
   
    } 
	
    /**
	  * class constructor that will be used by the derived classes
	  */
    
    public Plot (String lAddress, int Area,float f) {
	
    	super(lAddress,Area);
    	factorOfPlot=f;    
	   
    }
	
    /**
	 * 
	 */
	
	/* set methods */
    
    /**
	 * 
	 */
    
	public void setFactorOfPlot(float f) {
		factorOfPlot = f;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public float getFactorOfPlot() {
		return factorOfPlot;
	}
	
	/**
	 * 
	 */
     
	public void printLandData(){
		System.out.println("\nPlot Address : " + " "+landAddress);
		System.out.println("Plot Surface (in sqr mtrs): " + area);
		System.out.println("Plot Building Factor: " + factorOfPlot);

	}
	
	/**
	 * 
	 */
}