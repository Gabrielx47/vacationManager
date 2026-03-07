package com.example.vacationManager.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "SERVIDOR")
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "servidor_id_gen")
    @SequenceGenerator(name = "servidor_id_gen", sequenceName = "servidor_id_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column
    private String nome;
    @OneToMany(mappedBy = "servidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Ferias> ferias;
    @OneToMany(mappedBy = "servidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Pagamento> pagamentos;

    public Servidor() {
    }

    public Servidor(Long id) {
        this.id = id;
    }

    public Servidor(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Servidor(long id, String nome, Collection<Ferias> ferias, Collection<Pagamento> pagamentos) {
        this.id = id;
        this.nome = nome;
        this.ferias = ferias;
        this.pagamentos = pagamentos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Ferias> getFerias() {
        return ferias;
    }

    public void setFerias(Collection<Ferias> ferias) {
        this.ferias = ferias;
    }

    public Collection<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Collection<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Servidor servidor = (Servidor) o;
        return id == servidor.id && Objects.equals(nome, servidor.nome) && Objects.equals(ferias, servidor.ferias) && Objects.equals(pagamentos, servidor.pagamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ferias, pagamentos);
    }
}
