//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public class HourlyEmployee extends Employee {

	/*member variables*/
	
	protected float hourlyEmPrice;
    protected float numOfHours;
	
	
	 /**
	  * default class constructor, ie. constructor without arguments
	  */
  
    public HourlyEmployee() {		
     
    } 
	
    /**
	  * class constructor that will be used by the derived classes
	  */
  
    public HourlyEmployee (String fName, String eAfm, String eAddress,
    		               float hPrice,float hours) {
   
	   super(fName,eAfm,eAddress); 
	   hourlyEmPrice=hPrice;
	   numOfHours=hours;
	   
    }
   
    /**
	 * 
	 */
	
    /* set methods */
	
    /**
	 * 
	 */
    
	public void setHourlyEmPrice(float hPrice) {
		hourlyEmPrice = hPrice;
	}
	
	/**
	 * 
	 */
	
	public void setNumOfHours(float hours) {
		numOfHours = hours;
	}
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public float getHourlyEmPrice() {
		return hourlyEmPrice;
	}	
	
	/**
	 * 
	 */
	
	public float getNumOfHours() {
		return numOfHours;
	}
	
	/**
	 * 
	 */
	
	
    public void printEmployerData(){
    	System.out.println("\nHourly Employee Name: " + " "+employerName);
    	System.out.println("Hourly Employee Afm: "+" " + employerAfm);
    	System.out.println("Hourly Employee Address: : " + " "+employerAddress);
    	System.out.println("Hourly Employee Salary: : " + hourlyEmPrice);
    	System.out.println("Hourly Employee Number of Working Hours: " + numOfHours);
    }
    
    /**
	 * 
	 */
	
}