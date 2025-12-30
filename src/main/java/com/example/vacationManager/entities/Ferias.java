package com.example.vacationManager.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="FERIAS")
public class Ferias {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ferias_id_gen")
    @SequenceGenerator(name = "ferias_id_gen", sequenceName = "ferias_id_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    private LocalDate inicio;
    private LocalDate fim;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    private Servidor servidor;

    public Ferias() {
    }

    public Ferias(Long id, LocalDate inicio, LocalDate fim, Status status, Servidor servidor) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.status = status;
        this.servidor = servidor;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ferias ferias = (Ferias) o;
        return id == ferias.id && Objects.equals(inicio, ferias.inicio) && Objects.equals(fim, ferias.fim) && status == ferias.status && Objects.equals(servidor, ferias.servidor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inicio, fim, status, servidor);
    }
}
