
public class User {
	String name;
	String mobile;
	String altMobile;
	User(String name, String mobile, String altMobile){
		this.name = name;
		this.mobile = mobile;
		this.altMobile = altMobile;
	}
	void validate() throws SameNumberException{
		if(mobile.equals(altMobile) == true) {
			throw new SameNumberException("Both Mobile Numbers are Same!!!!");
		}
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Mobile : "+mobile);
		System.out.println("Alternate Mobile Number : "+altMobile);
	}
}
