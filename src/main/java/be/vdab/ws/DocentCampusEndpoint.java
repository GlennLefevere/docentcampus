package be.vdab.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import be.vdab.entities.Docent;
import be.vdab.exceptions.CampusHeeftNogDocentenException;
import be.vdab.services.CampusService;
import be.vdab.services.DocentService;

import com.mycompany.hr.schemas.DocentCampus;
import com.mycompany.hr.schemas.GetDocentRequest;
import com.mycompany.hr.schemas.GetDocentResponse;
import com.mycompany.hr.schemas.RemoveCampusRequest;

@Endpoint
public class DocentCampusEndpoint {
	private static final String NAMESPACE_URI = "http://mycompany.com/hr/schemas";
	private DocentService docentService;
	private CampusService campusService;
	
	@Autowired
	public DocentCampusEndpoint(DocentService docentService, CampusService campusService){
		this.docentService = docentService;
		this.campusService = campusService;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDocentRequest")
	@ResponsePayload
	public GetDocentResponse getDocent(@RequestPayload GetDocentRequest request){
		GetDocentResponse response = new GetDocentResponse();
		List<Docent> docenten = docentService.findAll(request.getFamilienaam());
		response.setDocent(toDocentCampus(docenten));
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "removeCampusRequest")
	public void removeCampus(@RequestPayload RemoveCampusRequest request) throws CampusHeeftNogDocentenException{
			campusService.remove(request.getId());
	}
	
	public List<DocentCampus> toDocentCampus(List<Docent> docenten){
		List<DocentCampus> docentCampusen = new ArrayList<DocentCampus>();
		for (Docent docent : docenten) {
			docentCampusen.add(new DocentCampus(docent));
		}
		return docentCampusen;
	}

}
