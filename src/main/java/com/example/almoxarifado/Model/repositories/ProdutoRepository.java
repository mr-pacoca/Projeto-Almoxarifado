package com.example.almoxarifado.Model.repositories;

import com.example.almoxarifado.Model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
