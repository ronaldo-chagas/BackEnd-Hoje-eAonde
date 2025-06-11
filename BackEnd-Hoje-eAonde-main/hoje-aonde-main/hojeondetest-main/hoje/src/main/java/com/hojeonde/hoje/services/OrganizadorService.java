package com.hojeonde.hoje.services;

import com.hojeonde.hoje.models.Organizador.Organizador;
import com.hojeonde.hoje.repositories.OrganizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizadorService {

    @Autowired
    private OrganizadorRepository organizadorRepository;

    public List<Organizador> findAll() {
        return organizadorRepository.findAll();
    }

    public Organizador findById(Long id) {
        return organizadorRepository.findById(id).orElse(null);
    }

    public Organizador save(Organizador organizador) {
        return organizadorRepository.save(organizador);
    }

    public void delete(Long id) {
        organizadorRepository.deleteById(id);
    }
}
