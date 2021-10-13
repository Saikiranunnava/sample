package pack;

import java.io.Serializable;

@SuppressWarnings("serial")
public class loginbean implements Serializable {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
public boolean check()
{
	if(getName().equals("payswiff") && getPassword().equals("ps123"))
	return true;
	else
		
	return false;
		
}

}
