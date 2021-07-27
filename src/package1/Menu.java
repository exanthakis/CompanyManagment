//____________________________ONOMATEPWNYMO MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY 2013030101_______________________________//

package package1;

import tuc.ece.cs102.util.StandardInputRead;

public class Menu {

    public int menuEisagwghs() {
	    int epilogh;

	    StandardInputRead sir = new StandardInputRead();
	    System.out.println("\n----------MENU------------");
	    System.out.println("\n[1].Insert-Delete Employees ");
	    System.out.println("[2].Insert-Delete Real Estate ");
	    System.out.println("[3].Print Data ");
	    System.out.println("[4].Search Data ");
	    System.out.println("[0].Exit ");
	    System.out.println("\n------------------------------");
	    epilogh=sir.readPositiveInt("Select -> ");
	
	    return epilogh;
    }
    
    /**
	 * 
	 */

    public int menuErgazomenwn() {
	    int epilogh;

	    StandardInputRead sir = new StandardInputRead();
	    System.out.println("\n[1].Insert Hourly Employee ");
	    System.out.println("[2].Insert Commision Employee ");
	    System.out.println("[3].Insert Base Plus Commision Employee ");
	    System.out.println("[4].Delete Hourly Employee ");
	    System.out.println("[5].Delete Commision Employee ");
	    System.out.println("[6].Delete Base Plus Commision Employee ");
	    System.out.println("[0].Exit ");
	    epilogh=sir.readPositiveInt("Select -> ");
	
	    return epilogh;
    }

    /**
	 * 
	 */
    
    public int menuAkinhtwn() {
	    int epilogh;

	    StandardInputRead sir = new StandardInputRead();
	    System.out.println("\n[1].Insert Plot  ");
	    System.out.println("[2].Delete Plot  ");
	    System.out.println("[3].Insert-Delete Building ");
	    System.out.println("[0].Exit ");
	    epilogh=sir.readPositiveInt("Select -> ");
	
	    return epilogh;
    }

    /**
	 * 
	 */
    
    public int menuKtismatwn() {
	    int epilogh;
	    StandardInputRead sir = new StandardInputRead();
	    
	    System.out.println("\n[3].Insert Building  ");
	    System.out.println("\n[1].Insert Company's Building ");
	    System.out.println("[2].Insert Lending Building ");
	    System.out.println("[3].Delete Company's Building ");
	    System.out.println("[4].Delete Lending Building ");
	    System.out.println("[0].Exit ");
	    epilogh=sir.readPositiveInt("Select -> ");
	
	    return epilogh;
    }
    
    /**
	 * 
	 */
    
    public int menuAnazhthshs() {
    	int epilogh;

	    StandardInputRead sir = new StandardInputRead();
	    System.out.println("\n[1].Search Employee ");
	    System.out.println("[2].Search Real Estate ");
	    System.out.println("[0].Exit ");
	    epilogh=sir.readPositiveInt("Select -> ");
	
	    return epilogh;
    }
    
    /**
	 * 
	 */
    
    public int menuEktypwshs() {
    	int epilogh;

	    StandardInputRead sir = new StandardInputRead();
	    System.out.println("\n[1].Print Hourly Employees ");
	    System.out.println("[2].Print Commision Employees  ");
	    System.out.println("[3].Print Base Plus Commision Employees ");
	    System.out.println("[4].Print Plots ");
	    System.out.println("[5].Print Company's Buildings ");
	    System.out.println("[6].Print Lending Buildings ");
	    System.out.println("[7].Print Buildings ");
	    System.out.println("[8].Print all employees and Land  ");
	    System.out.println("[0].Exit  ");
	    epilogh=sir.readPositiveInt("Select -> ");
	
	    return epilogh;
    }
    
    /**
	 * 
	 */
    
}