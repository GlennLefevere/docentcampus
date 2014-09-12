package be.vdab.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Docent;

public interface DocentDAO extends JpaRepository<Docent, Long>{

	List<Docent> findByFamilienaamLike(String stuk);

}
