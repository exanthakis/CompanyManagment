//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public class CommissionEmployee extends Employee{

    /*member variables*/
	
	protected float priceOfSales;
	protected float rateOfSupply;
	
	
	/**
	  * default class constructor, ie. constructor without arguments
	  */
 
    public CommissionEmployee() {		
    
    } 
	
    /**
	  * class constructor that will be used by the derived classes
	  */
 
    public CommissionEmployee (String fName, String eAfm, String eAddress,
    		                   float ePrice,float rate) {
  
	   super(fName,eAfm,eAddress); 
	   priceOfSales=ePrice;
	   rateOfSupply=rate;
	   
    }
	
    /**
	 * 
	 */
	
	/* set methods */
	
    /**
	 * 
	 */
    
	public void setPriceOfSales(float ePrice) {
		priceOfSales = ePrice;
	}
	
	/**
	 * 
	 */
	
	public void setRateOfSupply(float rate) {
		rateOfSupply = rate;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public float getPriceOfSales() {
		return priceOfSales;
	}	
	
	/**
	 * 
	 */
	
	public float getRateOfSupply() {
		return rateOfSupply;
	}
	
	/**
	 * 
	 */
	
	public void printEmployerData(){
		System.out.println("\nCommision Employee Name: " + " "+employerName);
		System.out.println("Commision Employee Afm: "+" " + employerAfm);
		System.out.println("Commision Employee Address: " + " "+employerAddress);
	    System.out.println("Commision Employee Amount of Sales:" +priceOfSales);
	    System.out.println("Employee Supply Rate: "+rateOfSupply);
	    	
	}
	
	/**
	 * 
	 */
	
}