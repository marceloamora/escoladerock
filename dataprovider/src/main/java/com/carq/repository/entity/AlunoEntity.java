package com.carq.repository.entity;


import com.carq.aluno.entity.Aluno;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "ALUNO")
public class AlunoEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private UUID registrationNumber;
    private String name;

    public AlunoEntity(UUID registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    public AlunoEntity(Long id, UUID registrationNumber, String name) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    public static AlunoEntity from(Aluno aluno) {
        return new AlunoEntity(aluno.getRegistationNumber(), aluno.getName());
    }


    public Long getId() {
        return id;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRegistrationNumber(UUID registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
