//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package packageLists;

public class MySortedList extends SortedList {

    public void printAllInHierarchy(String className){
   		    
	    for (Node tmp =  head;      tmp != null;      tmp = tmp.getNext()){ 
	        try{/*method getKey returns an object of employee or land class*/
	            if (Class.forName(className).isInstance(tmp.getValue().getKey())) 
	                tmp.getValue().print();
		    }
		    catch(ClassNotFoundException e){
		        System.out.println("ClassNotFoundException");
		    }         
        }		  
    }
}
	 

	
		
		
		
	




