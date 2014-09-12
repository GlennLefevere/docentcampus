package be.vdab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.DAO.CampusDAO;
import be.vdab.exceptions.CampusHeeftNogDocentenException;

@Service
@Transactional(readOnly = true)
public class CampusServiceImpl implements CampusService {
	private CampusDAO campusDao;

	@Autowired
	public CampusServiceImpl(CampusDAO campusDao) {
		this.campusDao = campusDao;
	}

	@Transactional(readOnly = false)
	@Override
	public void remove(long id) throws CampusHeeftNogDocentenException {
		if (campusDao.findOne(id).getDocentens().size() == 0) {
			campusDao.delete(id);
		}
		else{
			throw new CampusHeeftNogDocentenException("Campus heeft nog docenten");
		}
	}

}
