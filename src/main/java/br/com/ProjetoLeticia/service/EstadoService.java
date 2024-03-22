package br.com.ProjetoLeticia.service;

import br.com.ProjetoLeticia.enitiy.Estado;
import br.com.ProjetoLeticia.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {

        return estadoRepository.findAll();
    }

}