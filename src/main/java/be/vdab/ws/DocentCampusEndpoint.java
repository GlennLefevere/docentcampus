package be.vdab.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import be.vdab.entities.Docent;
import be.vdab.services.DocentService;

import com.mycompany.hr.schemas.DocentCampus;
import com.mycompany.hr.schemas.GetDocentRequest;
import com.mycompany.hr.schemas.GetDocentResponse;

@Endpoint
public class DocentCampusEndpoint {
	private static final String NAMESPACE_URI = "http://mycompany.com/hr/schemas";
	private DocentService docentService;
	
	@Autowired
	public DocentCampusEndpoint(DocentService docentService){
		this.docentService = docentService;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetDocentRequest")
	public GetDocentResponse getDocent(@RequestPayload GetDocentRequest request){
		GetDocentResponse response = new GetDocentResponse();
		List<Docent> docenten = docentService.findAll(request.getFamilienaam());
		response.setDocent(toDocentCampus(docenten));
		return response;
	}
	
	public List<DocentCampus> toDocentCampus(List<Docent> docenten){
		List<DocentCampus> docentCampusen = new ArrayList<DocentCampus>();
		for (Docent docent : docenten) {
			docentCampusen.add(new DocentCampus(docent.getId(), docent.getVoornaam(), docent.getFamilienaam(), docent.getCampussen().getNaam()));
		}
		return docentCampusen;
	}

}
