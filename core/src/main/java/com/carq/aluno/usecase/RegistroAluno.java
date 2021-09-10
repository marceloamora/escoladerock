package com.carq.aluno.usecase;

import com.carq.aluno.contract.AlunoRepository;
import com.carq.aluno.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAluno {
    @Autowired
    AlunoRepository alunoRepository;

    public void save(Aluno aluno){
        alunoRepository.save(aluno);
    }
}
