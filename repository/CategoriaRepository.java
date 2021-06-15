package com.lojadegames.LojaDeGamesAtualizado.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.LojaDeGamesAtualizado.model.CategoriaModel;


public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
public List<CategoriaModel> findAllByCategoriaContainingIgnoreCase(String categoria);

}
