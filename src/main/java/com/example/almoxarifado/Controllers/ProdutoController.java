package com.example.almoxarifado.Controllers;

import com.example.almoxarifado.Model.entities.Produto;
import com.example.almoxarifado.Model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/almo-sys/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto addEaltProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping(path="/{id}")
    public Optional<Produto> acharProduto(@PathVariable int id){
        return produtoRepository.findById(id);
    }
    @DeleteMapping(path="/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}