package net.guides.springboot2.crud.repository;

import net.guides.springboot2.crud.model.Responsibility;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibilityRepository extends CrudRepository<Responsibility, Long> {}