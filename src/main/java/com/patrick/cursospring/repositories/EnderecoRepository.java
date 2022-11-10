package com.patrick.cursospring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrick.cursospring.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer>{

}
