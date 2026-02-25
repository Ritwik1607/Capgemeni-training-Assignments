package assignment1;

public class User implements IValidate {

	private String userid;
	private String password;
	
	public User() {}
	
	void addUser(String userid,String password) {
		this.userid=userid;
		this.password=password;
	}

	public boolean IsAuthenticated(String userid,String password)
	{
		return this.userid.equals(userid) && this.password.equals(password);
	}
	@Override
	public String toString() {
		return "User{userid="+userid+"'}";
	}

	
	
}
