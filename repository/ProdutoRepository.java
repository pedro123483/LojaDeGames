package com.lojadegames.LojaDeGamesAtualizado.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.LojaDeGamesAtualizado.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);

}
