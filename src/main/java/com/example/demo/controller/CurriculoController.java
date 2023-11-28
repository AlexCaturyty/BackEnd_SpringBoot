package com.example.demo.controller;

import com.example.demo.model.Curriculo;
import com.example.demo.repo.CurriculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {

    @Autowired
    CurriculoRepo repository;

    @GetMapping(value = "/listar")
    public List<Curriculo> listarCurriculos()  {
        System.out.println("Lista de curriculos");
        return repository.findAll();
    }

    @PostMapping
    public void Salvar(@RequestBody Curriculo curriculo){
        System.out.println("Enviando mais curriculos");
        repository.save(curriculo);
    }

    @DeleteMapping("/{id}")
    public void deleteCurriculo(@PathVariable Long id) {
        System.out.println("Deletando currículo com ID: " + id);
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizarCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculoAtualizado) {
        System.out.println("Atualizando currículo com ID: " + id);
        if (repository.existsById(id)) {
            repository.save(curriculoAtualizado);
        } else {
            System.out.println("Currículo com ID " + id + " não encontrado.");
        }
    }
}
