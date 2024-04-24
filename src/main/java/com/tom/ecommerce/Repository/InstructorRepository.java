package com.tom.ecommerce.Repository;

import com.tom.ecommerce.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

List<Instructor> findByUsername(String firstName);
}
