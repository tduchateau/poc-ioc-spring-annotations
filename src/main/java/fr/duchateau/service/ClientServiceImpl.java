package fr.duchateau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.duchateau.persistance.ClientDao;
import fr.duchateau.transverse.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;
	
	public List<Client> getAll(){	
		return clientDao.getAll();
	}
}
