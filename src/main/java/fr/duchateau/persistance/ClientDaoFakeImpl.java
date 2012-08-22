package fr.duchateau.persistance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.duchateau.transverse.Client;

@Repository
public class ClientDaoFakeImpl implements ClientDao {

	public List<Client> getAll() {
		Client client1 = new Client("Prenom1", "Nom1");
		Client client2 = new Client("Prenom2", "Nom2");
		List<Client> liste = new ArrayList<Client>();
		liste.add(client1);
		liste.add(client2);
		return liste;		
	}
}
