package org.rrg.cl.copeuch.repository;

import java.util.List;

import org.rrg.cl.copeuch.entities.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends CrudRepository<Students, String> {
	
	List<Students> findByName(String name);
	
}
