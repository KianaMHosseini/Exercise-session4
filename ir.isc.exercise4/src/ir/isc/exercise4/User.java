package ir.isc.exercise4;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<String> account; 
	private String username;
	private transient String password;
	private transient String cardnum;
	
	
	@Override
	public String toString() {
		return "User [account=" + account + ", username=" + username + ", password=" + password + ", cardnum=" + cardnum
				+ "]";
	}


	public User(List<String> account, String username, String password, String cardnum) {
		super();
		this.account = account;
		this.username = username;
		this.password = password;
		this.cardnum = cardnum;
	}


	public List<String> getAccount() {
		return account;
	}


	public void setAccount(List<String> account) {
		this.account = account;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCardnum() {
		return cardnum;
	}


	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	
	
	

}
