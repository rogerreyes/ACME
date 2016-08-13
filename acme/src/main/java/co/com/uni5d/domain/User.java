package co.com.uni5d.domain;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings("serial")
@Document(collection = "User")
public class User implements Serializable {

	@Id
	private ObjectId id;

	private String username;

	private String address;

	private String email;

	public User() {
	}
	
	

	public User(String username, String address, String email) {
		super();
		this.username = username;
		this.address = address;
		this.email = email;
	}


	



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", email=" + email + "]";
	}

}
