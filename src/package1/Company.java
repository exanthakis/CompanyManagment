//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

import packageLists.EmployeeItem;
import packageLists.List;
import packageLists.LandItem;
import packageLists.MySortedList;
import packageLists.Node;

import tuc.ece.cs102.util.StandardInputRead;

public class Company {
    
	/*member variables*/
	
	/*Choose your maximum number of elements for Employer and Land list*/
	private static final int  MAX=5;

	protected String companyName;
	protected String companyAfm;
	protected String companyAddress;    
	
	/*list which contains Employers Data*/
	private MySortedList listofEmployees=new MySortedList();
	/*list which contains Land Data*/
	private MySortedList listOfLand=new MySortedList();

	private StandardInputRead sir = new StandardInputRead();
	 
	/**
	 * Class constructors
	 */
		
	public Company() {		
        
    } 

    public Company (String cName,String Afm,String a) {
    	companyName=cName;
    	companyAfm=Afm;
    	companyAddress=a;

    }
	/* set methods */
	
	/**
	 * 
	 */
	
	public void setCompanyName(String cName) {
		companyName = cName;
	}
	
	/**
	 * 
	 */
	
	public void setCompanyAfm(String cAfm) {
		companyAfm = cAfm;
	}
	
	/**
	 * 
	 */
	
	public void setCompanyAddress(String cAddress) {
		companyAddress = cAddress;
	}
	
	/**
	 * 
	 */
	
	/* get methods */
	
	/**
	 * 
	 */
	
	public String getCompanyName() {
		return companyName;
	}	
	
	/**
	 * 
	 */
	
	public String getCompanyAfm() {
		return companyAfm;
	}
	
	/**
	 * 
	 */
	
	public String getCompanyAddress() {
		return companyAddress;
	}
	
	/**
	 * 
	 */

	public void insertHourlyEmployees(){
			
		HourlyEmployee hEmployer= new HourlyEmployee();
		if (listofEmployees.getLength()<MAX){
            System.out.println("\n[1].Insert Hourly Employee:  \n ");
            hEmployer.setEmployerFirstName(sir.readString("\nInsert Fullname of Hourly Employee: "));		                    
            hEmployer.setEmployerAfm(sir.readString("Insert Afm of Hourly Employee: "));
            hEmployer.setEmployerAddress(sir.readString("Insert Adrress of Hourly Employee: "));
            hEmployer.setHourlyEmPrice(sir.readPositiveFloat("Insert Salary per Hour of Hourly Employee: "));
            hEmployer.setNumOfHours(sir.readPositiveFloat("Insert number of working hours: "));

            listofEmployees.insert(new EmployeeItem(hEmployer));
		}
		else{ 
			System.out.println("\n\nError!!You can't have more than "+MAX+" Employees \n");
			return ;
		}
			
	}
	
	/**
	 * 
	 */
	
	public void insertCommissionEmployees(){

		CommissionEmployee cEmployer= new CommissionEmployee();
		if (listofEmployees.getLength()<MAX){
		    System.out.println("\n[2].Insert Commission Employee: \n ");
            cEmployer.setEmployerFirstName(sir.readString("\nInsert Fullname of Commission Employee: "));
            cEmployer.setEmployerAfm(sir.readString("Insert Afm of Commission Employee: "));
            cEmployer.setEmployerAddress(sir.readString("Insert Adrress of Commission Employee: "));
            cEmployer.setPriceOfSales(sir.readPositiveFloat("Insert Amount of Sales of Commission Employee: "));
            cEmployer.setRateOfSupply(sir.readPositiveFloat("Insert the Supply Rate: "));
      
            listofEmployees.insert(new EmployeeItem(cEmployer));
		}
		else{
			System.out.println("\n\nError!!You can't have more than "+MAX+" Employees \n");
			return ;
		}
            
	}
	
	/**
	 * 
	 */
	
	public void insertBasePlusCommissionEmployees(){

		BasePlusCommissionEmployee bEmployer= new BasePlusCommissionEmployee();
		if (listofEmployees.getLength()<MAX){
		    System.out.println("\n[3].Insert Base Plus Commission Employee: \n ");
            bEmployer.setEmployerFirstName(sir.readString("Insert Fullname of Base Plus Commission Employee: "));
            bEmployer.setEmployerAfm(sir.readString("Insert Afm of Base Plus Commission Employee: "));
            bEmployer.setEmployerAddress(sir.readString("Insert Adrress of Base Plus Commission Employee: "));
            bEmployer.setPriceOfSales(sir.readPositiveFloat("Insert Amount of Sales of Commission Employee: "));
            bEmployer.setRateOfSupply(sir.readPositiveFloat("Insert the Supply Rate: "));
            bEmployer.setSalary(sir.readPositiveFloat("Insert Salary "));
      
            listofEmployees.insert(new EmployeeItem(bEmployer));
		}
		else {
			System.out.println("\n\nError!!You can't have more than "+MAX+" Employees \n");
			return ;
		}
	}
	
	/**
	 * 
	 */
	
	public void insertPlot(){

		Plot pLand= new Plot();
		if (listOfLand.getLength()<MAX){
            System.out.println("\n[1].Insert Plot:  \n ");
            pLand.setLandAddress(sir.readString("Insert Plot's Address: "));
            pLand.setArea(sir.readPositiveFloat("Insert Plot's Surface (in sqr mtrs): "));
            pLand.setFactorOfPlot(sir.readPositiveFloat("Insert Plot's Building Factor: "));

            listOfLand.insert(new LandItem(pLand));
		}
		else {
			System.out.println("\n\nError!!You can't have more than "+MAX+" Plots \n");
			return ;
		}
	}

	/**
	 * 
	 */
	
	public void insertCompanyBuilding(){

		CompanyBuilding cLand = new CompanyBuilding();
		if (listOfLand.getLength()<MAX){
            System.out.println("\n[1].Insert Company's Building : \n ");
            cLand.setLandAddress(sir.readString("\nInsert Company's Building Address: "));
       	    cLand.setArea(sir.readPositiveFloat("Insert Company's Building Surface (in sqr mtrs): "));
            cLand.setValueOfBuildings(sir.readPositiveInt("Insert Company's Building Value: "));

            listOfLand.insert(new LandItem(cLand));
		}
		else{
			System.out.println("\n\nError!!You can't have more than "+MAX+" Plots \n");
			return ;
		}
	}
	
	/**
	 * 
	 */

	public void insertLendingBuilding(){

		LendingBuilding lLand = new LendingBuilding();
		if (listOfLand.getLength()<MAX){
		    System.out.println("\n[2].Insert Lending Building : \n ");
            lLand.setLandAddress(sir.readString("\nInsert Lending's Building Address: "));
            lLand.setArea(sir.readPositiveFloat("Insert Lending's Building Surface (in sqr mtrs) : "));
            lLand.setPriceForLend(sir.readPositiveFloat("Insert Lending's Building Value:  "));
		    lLand.setExpiryYear(sir.readPositiveInt("Insert Expiration Year of Contract Rental Building: "));
              
		    listOfLand.insert(new LandItem(lLand));
		}
		else{
			System.out.println("\n\nError!!You can't have more than "+MAX+" Plots \n");
			return ;
		}
	}
	
	/**
	 * 
	 */
	
	public void deleteAll(int c){
		
		List l = new List ();
		if (c==1){
		    System.out.println("\n\n[4].Delete Hourly Employee: ");
		    printYourChoice(1);
		    l.delete1(listofEmployees,1);
		    printYourChoice(1);
		   
		}
		else if (c==2){
		    System.out.println("\n\n[5].Delete Commision Employee: ");
		    printYourChoice(2);
		    l.delete1(listofEmployees,2);
		    printYourChoice(2);
		}
		else if (c==3){
		    System.out.println("\n\n[6].Delete Base Plus Commission Employee: ");
		    printYourChoice(3);
		    l.delete1(listofEmployees,3);
		    printYourChoice(3);
		}
		else if (c==4){
		    System.out.println("\n\n[2]Delete Plot: ");
		    printYourChoice(4);
		    l.delete1(listOfLand,4);
		    printYourChoice(4);
		}
		else if (c==5){
		    System.out.println("\n\n[3].Delete Company's Building: ");
		    printYourChoice(5);
		    l.delete1(listOfLand,5);
		    printYourChoice(5);
		}
		else if (c==6){
		    System.out.println("\n\n[4].Delete Lending Building: ");
		    printYourChoice(6);
		    l.delete1(listOfLand,6);
		    printYourChoice(6);
		}
	}
	
	/**
	 * 
	 */
	
	public void searchEmployee(){
		
		System.out.println("\nInsert Fullname of the Employee you want to search ");
		String t=sir.readString("->");
		HourlyEmployee m = new HourlyEmployee(t,"","",0,0);

		Node n=listofEmployees.search(new EmployeeItem(m));
			   
		if (n==null) 
			System.out.println("\nERROR!! Not Found: "+ t);
		else{
			System.out.println("\nFound Employee with name : "+ t+" !!!\n\nEmployee Details: ");
			if (n!=null)
			    n.getValue().print();
		}		    
	}
	
	/**
	 * 
	 */
	
	public void searchLand(){

		System.out.println("\nInsert the Address of the Plot you are looking for ");
	    String a=sir.readString("->");
		Plot l=new Plot(a,0,0);
		    
		Node n1=listOfLand.search(new LandItem(l));
		    
		if (n1==null) 
	        System.out.println("ERROR!! Not Found: "+ a);
		else{
			System.out.println("Found Land with address "+ a +" !!!\n\nLand Details : ");
			if (n1!=null)
			    n1.getValue().print();
		}
	}
	
	/**
	 * 
	 */
	
	public void printYourChoice(int i){
		
		if (i==1){
			System.out.println("\n[1].Print Hourly Employees: ");
			listofEmployees.printAllInHierarchy("package1.HourlyEmployee"); 
		}
		else if (i==2){
			System.out.println("\n[2].Print Commission Employees: ");
			listofEmployees.printAllInHierarchy("package1.CommissionEmployee");
		}
		else if (i==3){
			System.out.println("\n[3].Print Base Plus Commission Employees : ");
			listofEmployees.printAllInHierarchy("package1.BasePlusCommissionEmployee");
		}
		else if (i==4){
			System.out.println("\n[4].Print Plots: ");
			listOfLand.printAllInHierarchy("package1.Plot");
		}
		else if (i==5){
			System.out.println("\n[5].Print Company's Buildings : ");
			listOfLand.printAllInHierarchy("package1.CompanyBuilding");
		}
		else if (i==6){
			System.out.println("\n[6].Print Lending Buildings : ");
			listOfLand.printAllInHierarchy("package1.LendingBuilding");
		}
		else if (i==7){
			System.out.println("\n[7].Print Buildings : ");
			listOfLand.printAllInHierarchy("package1.Building");
		}
	}
	
	/**
	 * 
	 */
	
	public void printAll(){
		System.out.println("\n[8].Print Employees and Land ");
		System.out.println("\nPrint Employees : ");
		listofEmployees.printAllInHierarchy("package1.Employee");
		
		System.out.println("\nPrint Land : ");
		listOfLand.printAllInHierarchy("package1.Land");
		
	}
	
	/**
	 * 
	 */	

	public void clearAllLists(){
 		listofEmployees.clearList();
		listOfLand.clearList();
	}

	/**
	 * 
	 */
	
	public void printCompanyData(){
		System.out.println("\n\nCompany's Details : " );
		System.out.println("\nCompany Name : " + companyName );
		System.out.println("Company Afm : " + companyAfm );
		System.out.println("Company Address : " + companyAddress);
	}
	
	/**
	 * 
	 */

}
	