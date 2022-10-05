package br.com.residencia.biblioteca.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
	
	public Alunos getAluno() {
		return aluno;
	}

	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}

	public Livros getLivro() {
		return livro;
	}

	public void setLivro(Livros livro) {
		this.livro = livro;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigoemprestimo")
	private Integer codigoemprestimo;
	
	@Column (name = "numeromatriculaaluno")
	private String numeroMatriculaAluno;
	
	

	@Column (name = "codigolivro")
	private String codigoLivro;
	

	@Column (name = "dataemprestimo ")
	private Instant dataEmprestimo;

	@Column (name = "dataentrega")
	private Instant dataEntrega;
	
	@Column (name = "valoremprestimo")
	private Value valorEmprestimo;
	
	@ManyToOne
	@JoinColumn (name = "numeromatriculaaluno",
	referencedColumnName = "numeromatriculaaluno")
	private Alunos aluno;
	
	@OneToOne
	@JoinColumn (name = "codigolivro",
	referencedColumnName = "codigolivro")
	private Livros livro;

	public Integer getCodigoemprestimo() {
		return codigoemprestimo;
	}

	public void setCodigoemprestimo(Integer codigoemprestimo) {
		this.codigoemprestimo = codigoemprestimo;
	}

	public String getNumeroMatriculaAluno() {
		return numeroMatriculaAluno;
	}

	public void setNumeroMatriculaAluno(String numeroMatriculaAluno) {
		this.numeroMatriculaAluno = numeroMatriculaAluno;
	}

	public String getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(String codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public Instant getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Instant dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Instant getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Instant dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Value getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(Value valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
}

