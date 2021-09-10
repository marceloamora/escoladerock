package com.carq.repository;

import com.carq.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {
}
