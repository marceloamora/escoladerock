package com.carq.aluno.entity;

import java.util.UUID;

public class Aluno {


    private final UUID registationNumber;
    private final String name;

    public Aluno(UUID registationNumber, String name) {
        this.registationNumber = UUID.randomUUID();
        this.name = name;
    }

    public UUID getRegistationNumber() {
        return registationNumber;
    }

    public String getName() {
        return name;
    }


}
