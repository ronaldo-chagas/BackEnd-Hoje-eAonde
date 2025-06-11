package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.Evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

@Repository
public interface EventoRepository extends JpaRepository<Evento, String> {
    boolean existsByNomeAndDataInicio(String nome, LocalDate dataInicio);

    boolean existsByNomeAndData(String nome, LocalDate dataInicio);
}
