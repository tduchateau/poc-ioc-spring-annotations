package fr.duchateau.persistance;

import java.util.List;

import fr.duchateau.transverse.Client;

public interface ClientDao {
	public List<Client> getAll();
}
