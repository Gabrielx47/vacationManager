package com.example.vacationManager.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "PAGAMENTO")
public class Pagamento {
    @Id
    private long id;
    private double valor;
    private LocalDate data;
    @ManyToOne
    private Servidor servidor;

    public Pagamento() {
    }

    public Pagamento(long id, Double valor, LocalDate data, Servidor servidor) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.servidor = servidor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
        Pagamento pagamento = (Pagamento) o;
        return id == pagamento.id && valor == pagamento.valor && Objects.equals(data, pagamento.data) && Objects.equals(servidor, pagamento.servidor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor, data, servidor);
    }
}
