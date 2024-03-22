package br.com.ProjetoLeticia.controller;

import br.com.ProjetoLeticia.enitiy.Estado;
import br.com.ProjetoLeticia.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

        @GetMapping(path = "/all", produces = "application/json")
        public ResponseEntity<List<Estado>> buscarTodos() {

            List<Estado> response = estadoService.buscarTodos();
            return ResponseEntity.ok(response);
        }
    }
