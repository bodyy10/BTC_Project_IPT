package btc_project.parts;

import java.util.*;

public class User {

	private String username;
	private String password;
	private String firstn;
	private String lastn;
	private String company;
	private Date created;
	
	public User(String username, String password, String firstn, String lastn, String company) {
		super();
		this.username = username;
		this.password = password;
		this.firstn = firstn;
		this.lastn = lastn;
		this.company = company;
		created = new Date();
	}
	
}
