package com.carq.controller;

import com.carq.aluno.entity.Aluno;
import com.carq.aluno.usecase.RegistroAluno;
import com.carq.converter.AlunoRequestConverter;
import com.carq.request.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private RegistroAluno registroAluno;

    @Autowired
    private AlunoRequestConverter requestConverter;
    @GetMapping
    public ResponseEntity<?> getAlunos(){
        return ResponseEntity.ok("Teste");
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest alunoRequest){
        Aluno aluno = requestConverter.toAluno(alunoRequest);
        this.registroAluno.save(aluno);
        ResponseEntity.ok();
    }


}

