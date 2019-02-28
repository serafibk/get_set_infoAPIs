package getInfo;

/* To be imported on VRMilling2
import javafish.clients.opc.component.OpcGroup;
import javafish.clients.opc.component.OpcItem;
import javafish.clients.opc.exception.CoInitializeException;
import javafish.clients.opc.exception.CoUninitializeException;
import javafish.clients.opc.exception.ComponentNotFoundException;
import javafish.clients.opc.exception.ConnectivityException;
import javafish.clients.opc.exception.SynchReadException;
import javafish.clients.opc.exception.SynchWriteException;
import javafish.clients.opc.exception.UnableAddGroupException;
import javafish.clients.opc.exception.UnableAddItemException;
import javafish.clients.opc.exception.UnableRemoveGroupException;
import javafish.clients.opc.exception.UnableRemoveItemException;
import javafish.clients.opc.variant.Variant;
import javafish.clients.opc.variant.VariantList;
 */
public class getTag {
	
	//instantiate tagName variable
	private String tagName;
	//JOpc jopc = new JOpc("localhost", "RSLinx OPC Server", "JOPC1");
	    
	    /*try {
	      JOpc.coInitialize();
	    }
	    catch (CoInitializeException e1) {
	      e1.printStackTrace();
	    }*/
	    
	    public getTag(String tagNameGiven) {
	    		tagName = tagNameGiven;
	    	
	    }
	    public getTag() {
	    		tagName = "NaN";
	    }
	    
	    //create item with given tag name
	    OpcItem item1 = new OpcItem(tagNameGiven, true, "AdvManLab");
	    
	    //create opc group
	    OpcGroup group = new OpcGroup("group1", true, 500, 0.0f);
	    group.addItem(item1);
	    
	    //connect to OPC to register group/item
	    try {
	    		jopc.connect();
	    		System.out.println("OPC connection successful...")
	    		jopc.addGroup(group);
	    		
	    		jopc.registerGroup(group);
	    		System.out.println("Group registration successful...");
	    		jopc.registerItem(group, item1);
	    		System.out.println("Item registration successful...");
	    		
	    		OpcItem itemRead = null;
	    		itemRead = jopc.synchReadItem(group, item1);
	    		itemReadValue = jopc.synchReadItem(group, item1).getValue();
	    		System.out.println(itemRead + "value: " itemReadValue);
	    		
	    }
	    catch (ConnectivityException e) {
	        e.printStackTrace();
	    }
        catch (ComponentNotFoundException e) {
          e.printStackTrace();
        } 
        catch (UnableAddGroupException e) {
          e.printStackTrace();
        }  
        catch (UnableAddItemException e) {
          e.printStackTrace();
        }
        catch (SynchReadException e) {
          e.printStackTrace();
        }
        catch (CoUninitializeException e) {
          e.printStackTrace();
        }
	    
	    
		
		


}
