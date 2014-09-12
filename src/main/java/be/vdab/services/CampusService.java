package be.vdab.services;

import be.vdab.exceptions.CampusHeeftNogDocentenException;


public interface CampusService {
	public void remove(long id) throws CampusHeeftNogDocentenException;  // TODO throw new CampusHeeftNogDocentenException();
}
