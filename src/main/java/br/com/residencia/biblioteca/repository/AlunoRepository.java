package br.com.residencia.biblioteca.repository;

import br.com.residencia.biblioteca.entity.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository 
extends JpaRepository<Aluno, Integer> 
{

}
