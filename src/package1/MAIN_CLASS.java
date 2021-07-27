//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package package1;

import tuc.ece.cs102.util.StandardInputRead;

public class MAIN_CLASS {
		
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		StandardInputRead sir = new StandardInputRead();
		Company company = new Company();
        Menu m=new Menu();
        
        int epilogh=-1,epiloghErgazomenoy=-1,epiloghEktypwshs=-1;
        int epiloghAkinhtoy=-1,epiloghKtismatos=-1,epiloghAnazhthshs=-1;
       
        
        /*insert Company*/
        System.out.println("Insert Company's Details\n ");
	    String name=sir.readString("Give the name of the company: ");
	    String afm =sir.readString("Give AFM of the company: ");
	    String address=sir.readString("Give the address of the company: ");
	    
	    company.setCompanyName(name);
	    company.setCompanyAfm(afm);
	    company.setCompanyAddress(address);	
        
         
        while(epilogh!=0){	
		    epilogh=m.menuEisagwghs();
			
            switch (epilogh) {
	
		        case 1 :{
		            epiloghErgazomenoy=m.menuErgazomenwn();
		        	if (epiloghErgazomenoy==1){/*insert HourlyEmployee*/		        
		                company.insertHourlyEmployees();
		                
		            }
		        	else if (epiloghErgazomenoy==2){/*insert CommissionEmployee*/		            
		        	    company.insertCommissionEmployees();
		        	}
		        	else if (epiloghErgazomenoy==3){/*insert BasePlusCommissionEmployee*/		           
		        		company.insertBasePlusCommissionEmployees();
		        	}
		        	else if (epiloghErgazomenoy==4){/*delete HourlyEmployee*/
		             	company.deleteAll(1);
		        	}
		        	else if (epiloghErgazomenoy==5){/*delete CommissionEmployee*/
		        		company.deleteAll(2);
		        	}
		        	else if (epiloghErgazomenoy==6){/*delete BasePlusCommissionEmployee*/
		        		company.deleteAll(3);
		        	}
		        	
		        	break;
		        }
		        case 2 : {
	                epiloghAkinhtoy=m.menuAkinhtwn(); 
	        		if (epiloghAkinhtoy==1){/*insert Plot*/
	        		    company.insertPlot();	
	        		}
	        		else if (epiloghAkinhtoy==2){/*delete Plot*/
	        			company.deleteAll(4);
	        		}
	        		else if (epiloghAkinhtoy==3){/*insert-delete Building*/
	        		     epiloghKtismatos=m.menuKtismatwn();
	        		     if (epiloghKtismatos==1){/*insert CompanyBuilding*/
	        		          company.insertCompanyBuilding();
	        		      }
	        		      else if (epiloghKtismatos==2){/*insert LendingBuilding*/
	        		        	company.insertLendingBuilding();       	                    
	        		      }
	        		      else if (epiloghKtismatos==3){/*delete CompanyBuilding*/
	        		        	company.deleteAll(5);
	        		      }
	        		      else if (epiloghKtismatos==4){/*delete LendingBuilding*/
	        		        	company.deleteAll(6);
	        		      }
	        		     
	        		      break;	        		      
		            }
	        
	        		break;  
	        	}
		        case 3 : {/*print data*/
		        	epiloghEktypwshs=m.menuEktypwshs();
		        	company.printCompanyData();
		        	if (epiloghEktypwshs==1)/*print HourlyEmployee*/
		        		company.printYourChoice(1);
		        	else if (epiloghEktypwshs==2)/*print CommissionEmployee*/
		        		company.printYourChoice(2);
		        	else if (epiloghEktypwshs==3)/*print BasePlusCommissionEmployee*/
		        		company.printYourChoice(3);
		        	else if (epiloghEktypwshs==4)/*print Plot*/
		        		company.printYourChoice(4);
		        	else if (epiloghEktypwshs==5)/*print CompanyBuilding*/
		        		company.printYourChoice(5);
		        	else if (epiloghEktypwshs==6)/*print LendingBuilding*/
		        		company.printYourChoice(6);
		        	else if (epiloghEktypwshs==7)/*print CompanyBuilding & LendingBuilding*/
		        		company.printYourChoice(7);
		        	else if (epiloghEktypwshs==8)/*print all Data*/   
		        	    company.printAll();

		        	break;
		        }
		        case 4 : {/*search data*/
		        	epiloghAnazhthshs=m.menuAnazhthshs();
		        	if (epiloghAnazhthshs==1)/*search Employee*/
		        	    company.searchEmployee();
		        	else if (epiloghAnazhthshs==2)/*search Land*/
		        		company.searchLand();
		        	break;
		        }
		        	
		    }
        }
        company.clearAllLists();/*set head of all lists null and length 0 */
	}


}

