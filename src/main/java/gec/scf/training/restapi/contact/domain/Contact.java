package gec.scf.training.restapi.contact.domain;

public class Contact {

	private String name;
	private String address;

	public Contact(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {

		return name;
	}

	public String getAddress() {

		return address;
	}

}
