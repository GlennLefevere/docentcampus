package be.vdab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Campus;

public interface CampusDAO extends JpaRepository<Campus, Long>{

}
