package gec.scf.training.restapi.contact.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gec.scf.training.restapi.contact.domain.Contact;
import gec.scf.training.restapi.contact.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService contactService;

	@RequestMapping(path = "/contact")
	Contact getContact() {
		return contactService.getContact();
	}
}
