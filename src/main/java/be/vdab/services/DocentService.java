package be.vdab.services;

import java.util.List;

import be.vdab.entities.Docent;

public interface DocentService {
	List<Docent> findAll(String stuk);
}
