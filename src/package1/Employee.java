//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public abstract class Employee  {

   /*member variables*/
	
    protected String employerName;
    protected String employerAfm;
    protected String employerAddress;

    public abstract void printEmployerData();
   
    /**
	  * default class constructor, ie. constructor without arguments
	  */
   
    public Employee() {		
      
    } 
	
    /**
	  * class constructor that will be used by the derived classes
	  */
   
    public Employee (String fName, String eAfm, String eAddress) {
      
	   employerName = fName;
	   employerAfm = eAfm;
	   employerAddress = eAddress;
	   
    }
   
    /**
	 * 
	 */
    
	/* set methods */
	
    /**
	 * 
	 */
    
	public void setEmployerFirstName(String fName) {
		employerName = fName;
	}
	
	/**
	 * 
	 */
	
	
	public void setEmployerAfm(String eAfm) {
		employerAfm = eAfm;
	}
	
	/**
	 * 
	 */
	
	public void setEmployerAddress(String eAddress) {
		employerAddress = eAddress;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public String getEmployerFirstName() {
		return employerName;
	}	
	
	/**
	 * 
	 */
	
	
	public String getEmployerAfm() {
		return employerAfm;
	}
	
	/**
	 * 
	 */
	
	public String getEmployerAddress() {
		return employerAddress;
	}

	/**
	 * 
	 */
	
}