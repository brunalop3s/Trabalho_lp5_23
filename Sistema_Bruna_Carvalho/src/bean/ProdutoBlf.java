package bean;
// Generated 15/09/2023 22:23:57 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoBlf generated by hbm2java
 */
@Entity
@Table(name="produto_blf"
    ,catalog="db_bruna_carvalho"
)
public class ProdutoBlf  implements java.io.Serializable {


     private int idProdutoBlf;
     private String nomeBlf;
     private String categoriaBlf;
     private String marcaBlf;
     private double precoBlf;
     private String generoBlf;
     private String tamanhoBlf;
     private int quantidadeBlf;
     private Set compraProdutoBlfs = new HashSet(0);

    public ProdutoBlf() {
    }

	
    public ProdutoBlf(int idProdutoBlf, String nomeBlf, String categoriaBlf, String marcaBlf, double precoBlf, String generoBlf, String tamanhoBlf, int quantidadeBlf) {
        this.idProdutoBlf = idProdutoBlf;
        this.nomeBlf = nomeBlf;
        this.categoriaBlf = categoriaBlf;
        this.marcaBlf = marcaBlf;
        this.precoBlf = precoBlf;
        this.generoBlf = generoBlf;
        this.tamanhoBlf = tamanhoBlf;
        this.quantidadeBlf = quantidadeBlf;
    }
    public ProdutoBlf(int idProdutoBlf, String nomeBlf, String categoriaBlf, String marcaBlf, double precoBlf, String generoBlf, String tamanhoBlf, int quantidadeBlf, Set compraProdutoBlfs) {
       this.idProdutoBlf = idProdutoBlf;
       this.nomeBlf = nomeBlf;
       this.categoriaBlf = categoriaBlf;
       this.marcaBlf = marcaBlf;
       this.precoBlf = precoBlf;
       this.generoBlf = generoBlf;
       this.tamanhoBlf = tamanhoBlf;
       this.quantidadeBlf = quantidadeBlf;
       this.compraProdutoBlfs = compraProdutoBlfs;
    }
   
     @Id 

    
    @Column(name="id_produto_blf", unique=true, nullable=false)
    public int getIdProdutoBlf() {
        return this.idProdutoBlf;
    }
    
    public void setIdProdutoBlf(int idProdutoBlf) {
        this.idProdutoBlf = idProdutoBlf;
    }

    
    @Column(name="nome_blf", nullable=false, length=35)
    public String getNomeBlf() {
        return this.nomeBlf;
    }
    
    public void setNomeBlf(String nomeBlf) {
        this.nomeBlf = nomeBlf;
    }

    
    @Column(name="categoria_blf", nullable=false, length=20)
    public String getCategoriaBlf() {
        return this.categoriaBlf;
    }
    
    public void setCategoriaBlf(String categoriaBlf) {
        this.categoriaBlf = categoriaBlf;
    }

    
    @Column(name="marca_blf", nullable=false, length=30)
    public String getMarcaBlf() {
        return this.marcaBlf;
    }
    
    public void setMarcaBlf(String marcaBlf) {
        this.marcaBlf = marcaBlf;
    }

    
    @Column(name="preco_blf", nullable=false, precision=10)
    public double getPrecoBlf() {
        return this.precoBlf;
    }
    
    public void setPrecoBlf(double precoBlf) {
        this.precoBlf = precoBlf;
    }

    
    @Column(name="genero_blf", nullable=false, length=1)
    public String getGeneroBlf() {
        return this.generoBlf;
    }
    
    public void setGeneroBlf(String generoBlf) {
        this.generoBlf = generoBlf;
    }

    
    @Column(name="tamanho_blf", nullable=false, length=3)
    public String getTamanhoBlf() {
        return this.tamanhoBlf;
    }
    
    public void setTamanhoBlf(String tamanhoBlf) {
        this.tamanhoBlf = tamanhoBlf;
    }

    
    @Column(name="quantidade_blf", nullable=false)
    public int getQuantidadeBlf() {
        return this.quantidadeBlf;
    }
    
    public void setQuantidadeBlf(int quantidadeBlf) {
        this.quantidadeBlf = quantidadeBlf;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produtoBlf")
    public Set getCompraProdutoBlfs() {
        return this.compraProdutoBlfs;
    }
    
    public void setCompraProdutoBlfs(Set compraProdutoBlfs) {
        this.compraProdutoBlfs = compraProdutoBlfs;
    }




}

