package com.carq.repository;

import com.carq.aluno.contract.AlunoRepository;
import com.carq.aluno.entity.Aluno;
import com.carq.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl  implements AlunoRepository {

    @Autowired
    AlunoDao alunoDao;
    @Override
    public void save(Aluno aluno) {

        alunoDao.save(AlunoEntity.from(aluno));
    }
}
