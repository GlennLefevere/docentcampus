package be.vdab.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

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
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDocentRequest")
	@ResponsePayload
	public GetDocentResponse getDocent(@RequestPayload GetDocentRequest request){
		GetDocentResponse response = new GetDocentResponse();
		List<Docent> docenten = docentService.findAll("%"+request.getFamilienaam()+"%");
		System.out.println(docenten.size());
		response.setDocent(toDocentCampus(docenten));
		return response;
	}
	
	public List<DocentCampus> toDocentCampus(List<Docent> docenten){
		List<DocentCampus> docentCampusen = new ArrayList<DocentCampus>();
		for (Docent docent : docenten) {
			System.out.println(docent.getId());
			docentCampusen.add(new DocentCampus(docent.getId(), docent.getVoornaam(), docent.getFamilienaam(), docent.getCampussen().getNaam()));
		}
		return docentCampusen;
	}

}
