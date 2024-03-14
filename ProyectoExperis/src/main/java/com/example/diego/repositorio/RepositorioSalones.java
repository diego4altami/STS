package com.example.diego.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.diego.modelos.Salon;

@Repository
public interface RepositorioSalones extends CrudRepository<Salon, Long>{

	List<Salon> findAll();
}