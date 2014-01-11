
public class CodeSnippet {
	
	/*

// This is an accumulation method which accumulates information 
	// into itemInformation. I want to split this big method into
	// many smaller methods. The String data type won't allow me to 
	// accumulate information across methods though so I'll use a
	// StringBuffer instead. 
	
	public String toString(){
		
		StringBuffer itemInfo = new StringBuffer();
		
		addItemInfoAndChildren(itemInfo);
		
		return itemInfo.toString();
		
		// This gets moved to addItemInfoAndChildren()
		// addItemInformation(itemInfo);
		
		/*
		String itemInformation = "\n" + itemName + " ";
		
		if(!itemInfoHM.isEmpty()){
			
			itemInformation += displayProductInfo();
			
		}
		
		
		Iterator<Item> it = children.iterator();
		
		while(it.hasNext()){
			
			Item node = (Item)it.next();
			
			// Because node recursively calls toString and I
			// can't pass a parameter to toString() I need
			// to create another method to handle what toString
			// used to do but will accept the StringBuffer
			// passed as a parameter
			
			itemInformation += node.toString();
			
		}
		
		return itemInformation;
		
	
		
	}
	
	private void addItemInfoAndChildren(StringBuffer itemInfo){
		
		addItemInformation(itemInfo);
		
		addChildrenInformation(itemInfo);
		
	}
	
	// Adds the Item name and Item info stored in the HashMap
	
	private void addItemInformation(StringBuffer itemInfo){
		
		itemInfo.append("\n" + itemName + " ");
		
		// Adds Item information from HashMap if it exists
		
		if(!itemInfoHM.isEmpty()){
			
			itemInfo.append(displayProductInfo());
			
		}
		
	}
	
	private void addChildrenInformation(StringBuffer itemInfo){
		
		Iterator<Item> it = children.iterator();
		
		while(it.hasNext()){
			
			Item node = (Item)it.next();
			itemInfo.append(node.toString());
			
		}
		
	}
	 */

}
