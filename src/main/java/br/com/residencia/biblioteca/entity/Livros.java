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

@Entity
@Table(name = "livros")
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "codigolivro")
	private Integer codigoLivro;
	

	@ManyToOne
	@JoinColumn(name =  "codigoeditora", 
	referencedColumnName = "codigoeditora")
	private Editora editora;
	
	@OneToOne (mappedBy="livro")
	private Emprestimo emprestimo1;
	

	public Emprestimo getEmprestimo1() {
		return emprestimo1;
	}


	public void setEmprestimo1(Emprestimo emprestimo1) {
		this.emprestimo1 = emprestimo1;
	}


	public Emprestimo getLivro() {
		return livro;
	}


	public void setLivro(Emprestimo livro) {
		this.livro = livro;
	}


	public Emprestimo getEmprestimo() {
		return emprestimo;
	}


	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}


	@OneToOne(mappedBy="livro")
	private Emprestimo livro;

	
	@Column (name = "nomelivro")
	private String nomeLivro;
	
	@OneToOne(mappedBy = "livro")
	private Emprestimo emprestimo;
	
	@Column (name = "nomeautor")
	private String nomeAutor;
	
	@Column (name = "datalancamento")
	private Instant dataLancamento;
	
	@Column (name = "codigoisbn")
	private Integer codigoIsbn;
	
	@Column (name = "codigoeditora")
	private Integer codigoEditora;

	
	public Integer getCodigoLivro() {
		return codigoLivro;
	}


	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}


	public String getNomeLivro() {
		return nomeLivro;
	}


	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}


	public Instant getDataLancamento() {
		return dataLancamento;
	}


	public void setDataLancamento(Instant dataLancamento) {
		this.dataLancamento = dataLancamento;
	}


	public Integer getCodigoIsbn() {
		return codigoIsbn;
	}


	public void setCodigoIsbn(Integer codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}


	public Integer getCodigoEditora() {
		return codigoEditora;
	}


	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	}


	public Editora getEditora() {
		return editora;
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}


}