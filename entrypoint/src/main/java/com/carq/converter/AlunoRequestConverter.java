package com.carq.converter;

import com.carq.aluno.entity.Aluno;
import com.carq.request.AlunoRequest;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class AlunoRequestConverter {

    public Aluno toAluno(AlunoRequest alunoRequest){
        Aluno aluno = new Aluno(UUID.randomUUID(), alunoRequest.getName());
        return  aluno;
    }
}
