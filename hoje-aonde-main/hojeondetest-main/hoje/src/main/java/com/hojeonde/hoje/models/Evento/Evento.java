package com.hojeonde.hoje.models.Evento;

import jakarta.persistence.*;
import lombok.*;
import com.hojeonde.hoje.models.Local.Local;
import com.hojeonde.hoje.models.Organizador.Organizador;


@Entity
@Table(name = "eventos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;



    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Organizador organizador;
}
