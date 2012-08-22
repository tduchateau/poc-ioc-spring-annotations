package fr.duchateau.transverse;

public class Client {

	private String lastname;
	private String firstname;

	public Client(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}