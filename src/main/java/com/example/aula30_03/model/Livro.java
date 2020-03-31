package com.example.aula30_03.model;

/**
 * Livro
 */
public class Livro {
   
    private String titulo;
    private String autor;
    private int edicao;
    private int paginas;
    private double preco;
    private String categoria;

    public Livro(String titulo, String autor, int edicao, int paginas, double preco, String categoria) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.paginas = paginas;
        this.preco = preco;
        this.categoria = categoria;
	}
    
   	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
    }
    

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", categoria=" + categoria + ", edicao=" + edicao + ", paginas=" + paginas
				+ ", preco=" + preco + ", titulo=" + titulo + "]";
	}
	

    
    
}