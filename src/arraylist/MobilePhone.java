package arraylist;

import java.util.ArrayList;


public class MobilePhone {
	
	
	private String myNumber;
	private ArrayList<Contact> mycontact;
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		ArrayList<Contact> mycontact =new ArrayList<Contact>();
	}
	
	public boolean addnewContact(Contact contact) {
		 
		if (findContact(contact)== -1) {
			mycontact.add(contact);
			return true;
		}
		System.out.println("number alrady there");
		return false;
	}
	
	public boolean updateContact(Contact oldcontact , Contact newcontact) {
		String oname =oldcontact.getName();
		String nname =newcontact.getName(); 
		int place= findContact(oname);
		if (findContact(oname) !=-1) {
			if (findContact(nname) ==-1 ) {
				mycontact.set(place, newcontact);
				return true;
			}
			return false;
		}
		return  false;
	}
	
	public boolean removeContact(Contact contact) {
		
		if (findContact(contact)>=0) {
			 mycontact.remove(findContact(contact));
			 return true;
		}
		return false;
	}
	public int findContact(Contact contact) {
		if (mycontact.equals(contact)) {
			return mycontact.indexOf(contact);
		}
		return -1;
	}
	
	public int findContact(String name ) {
		if (mycontact.equals(name)) {
			return mycontact.indexOf(name);
		}
		return -1;
	}
	
}
