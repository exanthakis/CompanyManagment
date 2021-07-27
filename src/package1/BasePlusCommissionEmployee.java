//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	/*member variables*/
	
    protected float salary;
	
	/**
	  * default class constructor, ie. constructor without arguments
	  */

    public BasePlusCommissionEmployee() {		
   
    } 
	
    /**
	 * class constructor that will be used by the derived classes
	 */

    public BasePlusCommissionEmployee (String fName, String eAfm, String eAddress,
		                                 int ePrice,int rate,float salaryy){
 
	   super(fName,eAfm,eAddress,ePrice,rate); 
	   salary=salaryy;
	   
    }
   
    /**
	 * 
	 */
	
    /* set methods */
    
    /**
	 * 
	 */
   
     public void setSalary(float salaryy) {
		salary = salaryy;
	 }
	
	 /**
	  * 
	  */
	
	 /* get methods */
	
	 /**
	  * 
	  */
	
	 public float getSalary() {
		 return salary;
	 }
	
	 /**
	  * 
	  */
		
	 public void printEmployerData(){
   	     System.out.println("\nBase Plus Commision Employee Name: " + " "+employerName);
		 System.out.println("Base Plus Commision Employee Afm: "+" " + employerAfm);
		 System.out.println("Base Plus Commision Employee Address: " + " "+employerAddress);
		 System.out.println("Base Plus Commision Employee Amount of Sales: " +priceOfSales);
		 System.out.println("Base Plus Commision Employee Supply Rate: "+rateOfSupply);
	     System.out.println("Base Plus Commision Employee Salary: "+salary);

	 }
	 
	 /**
	  * 
	  */
	 
}