package com.example.diego.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.diego.modelos.Hobby;

public interface RepositorioHobbies extends CrudRepository<Hobby, Long>{
	List<Hobby> findAll();
}
