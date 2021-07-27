//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package packageLists;

import package1.HourlyEmployee;
import package1.Plot;
import tuc.ece.cs102.util.StandardInputRead;

public class List {
	
	protected Node head;              /*first */
	protected int length;             /*total elements of list*/ 


	/**
	 * Class constructor
	 */
	
	public List() {  
		
		head = null;  
		length = 0; 
	}    
	
	/**
	 * 
	 */
	
	public boolean isEmpty() { 
		return head == null; 
	}
	
	/**
	 * 
	 */
	
	public Node insert(Item a) {    
	      length++;
	      head = new Node(a, head);
	      return head;
	}
	
	/**
	 * 
	 */
	
	public int getLength() { 
		return length; 
	}
	
	/**
	 * 
	 */
	
	public void clearList() { 
		head = null; 
		length = 0; 
	}
	
	/**
	 * 
	 */
	
	public void print() {
	   int i=0;
	   for (Node tmp = head;      tmp != null;      tmp = tmp.getNext())
	   {
	      System.out.println("\n[No."+(i+1)+"]\n");
	      tmp.print();
	      i++;
	   }
	}

	/**
	 * 
	 */
	
    public Node search(Item a) {
		    for (Node tmp = head;     tmp != null;      tmp = tmp.getNext())
	             if (a.equals(tmp.getValue()))    
		            return tmp;                           
	         return null;                                 
	}

    /**
	 * 
	 */
    
	public Node delete (Item a) {
	    Node n1 = head, n2 = head;

		while ((n1 != null) && (!a.equals( n1.getValue() ) ) ) {  

		 n2 = n1; n1 = n1.getNext(); 
		 }
		 if (n1 != null) {  
		     length--;
		     if (n2 != n1)    
		         n2.setNext(n1.getNext());
		     else                 
		         head = head.getNext();     
		     n1.setNext(null);
		  }
		 return head;
	}
	
	/**
	 * 
	 */
	
	public void delete1(List v,int c){
		StandardInputRead sir = new StandardInputRead();

		if(v.isEmpty())
		{
			System.out.println("\nThere are no Registered Data");
			return ;
		}

		if ( (c==1) || (c==2) || (c==3) )
		    System.out.println("\nInsert the name of the Employee You Want to Delete ");
		if ( (c==4) || (c==5) || (c==6) )
		    System.out.println("\nInsert the address of the Plot You Want to Delete ");

		String testInput=sir.readString("->");/*Name or Address*/

	    Node n1=null;
	    if( (c==1) || (c==2) || (c==3) )/*search the name or the address that you give*/  
	        n1 = v.search(new EmployeeItem(new HourlyEmployee(testInput,"","",0,0)));
	    else if( (c==4) || (c==5) || (c==6) )
	        n1 = v.search(new LandItem(new Plot(testInput,0,0)));
	    
	    if (n1 == null){
	        System.out.println("Not Found... " + testInput);
	    }
	    else{/*if the name or the address found in list*/
	        System.out.println("Found!!! : " + n1.getValue().key());
	        v.delete(n1.getValue());
	    }
	}
	
	/**
	 * 
	 */		
	
}