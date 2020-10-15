package org.rrg.cl.copeuch.repository;

import java.util.List;

import org.rrg.cl.copeuch.entities.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, String> {
	
	List<Courses> findByName(String name);
	
} 
