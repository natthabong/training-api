package gec.scf.training.restapi.contact.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import gec.scf.training.restapi.contact.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Value("${contact.name}")
	private String name;

	private String address;

	@Override
	public Contact getContact() {
		return new Contact(name, address);
	}

}
