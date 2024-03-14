package com.example.diego.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.diego.modelos.Direccion;

@Repository
public interface RepositorioDirecciones extends CrudRepository<Direccion, Long>{
	List<Direccion> findAll();
}
