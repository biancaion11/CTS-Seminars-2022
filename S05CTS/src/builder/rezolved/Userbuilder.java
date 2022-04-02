package builder.rezolved;

public class Userbuilder {
	private String username;
	private String firstname;
	private String lastname;
	private String email;


	private String phoneNo;
	private String adress;
	private String birthaday;

	public Userbuilder(UserBuilder u) {
		this.username= username;
		this.email= email;
		this.firstname=firstname;
		this.lastname=lastname;
		
		this.adress=adress;
		this.birthaday=birthaday;
		this.phoneNo=phoneNo;
		
		
	}
	public static class UserBuilder{
		private String username;
		private String firstname;
		private String lastname;
		private String email;


		private String phoneNo;
		private String adress;
		private String birthaday;
	}
	
	public Userbuilder(String username, String firstname, String lastname, String email) {
		this.username= username;
		this.email= email;
		this.firstname=firstname;
		this.lastname=lastname;}
	
	public Userbuilder birthaday(String birthaday) {
		this.birthaday=birthaday;
		return this;
		
	}
	public Userbuilder phoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
		return this;
		
	}
	public Userbuilder build() {
		Userbuilder =new Userbuilder();
		
	}
	
}
