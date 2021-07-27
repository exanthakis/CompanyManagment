//____________________________ONOMATEPWNYMO: MANOLIS XANTHAKIS_______________________________//
//____________________________ARI8MOS FOIT.MHTRWOY: 2013030101_______________________________//

package packageLists;

public class Node {

    private Item info;
    private Node next;
    
    /**
	 * 
	 */
    
	public Node(Item dat) { 
		info = dat; 
	}   
	
	/**
	 * 
	 */
	
	public Node(Item dat, Node b) {
		info = dat;  
	    next = b;
    }
	
	/**
	 * 
	 */
	
	public Item  getValue() { 
		return info;  
	}   
	
	/**
	 * 
	 */
	
    public void     setNext(Node a)  {
    	next = a;     
    }
	
    /**
	 * 
	 */
    
    public Node getNext() { 
    	return next; 
    }
	
    /**
	 * 
	 */
    
	public void print(){
		info.print();
	}

	/**
	 * 
	 */
	
}
