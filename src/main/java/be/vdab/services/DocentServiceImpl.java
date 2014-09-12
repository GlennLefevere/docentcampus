package be.vdab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.DAO.DocentDAO;
import be.vdab.entities.Docent;

@Service
@Transactional(readOnly = true)
public class DocentServiceImpl implements DocentService{
	private DocentDAO docentDAO;

	@Autowired
	public DocentServiceImpl(DocentDAO docentDAO) {
		this.docentDAO = docentDAO;
	}

	@Override
	public List<Docent> findAll(String stuk) {
		return docentDAO.findByFamilienaamContaining(stuk);
	}

}
