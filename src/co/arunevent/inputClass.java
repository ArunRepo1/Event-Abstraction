package co.arunevent;

public class inputClass {
	
	int ID;
	String name;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public inputClass(int id2, String name2) {
		System.out.println("Entered ID is: "+ID);
		System.out.println("Entered Name is: "+name);	}
	

}
