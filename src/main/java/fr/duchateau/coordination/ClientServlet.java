package fr.duchateau.coordination;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import fr.duchateau.service.ClientService;
import fr.duchateau.transverse.Client;

@Component("ClientServlet")
public class ClientServlet implements HttpRequestHandler {

	@Autowired
	private ClientService clientService;

	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
	   throws ServletException, IOException {

		// Sauvegarde du client
		List<Client> liste = clientService.getAll();

		// Mise en requete de la liste
		request.setAttribute("clients", liste);
		
		// Redirection vers la JSP welcome.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/result.jsp");
		dispatcher.forward(request, response);
	}
}