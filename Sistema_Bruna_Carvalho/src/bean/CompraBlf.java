package bean;
// Generated 27/10/2023 20:56:57 by Hibernate Tools 4.3.1



import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CompraBlf generated by hbm2java
 */
@Entity
@Table(name="compra_blf"
    ,catalog="db_bruna_carvalho"
)
public class CompraBlf  implements java.io.Serializable {


     private int idCompraBlf;
     private FornecedorBlf fornecedorBlf;
     private UsuarioBlf usuarioBlf;
     private Date dataCompraBlf;
     private double totalCompraBlf;
    
 

    public CompraBlf() {
    }

	
    public CompraBlf(int idCompraBlf, FornecedorBlf fornecedorBlf, UsuarioBlf usuarioBlf, Date dataCompraBlf, double totalCompraBlf) {
        this.idCompraBlf = idCompraBlf;
        this.fornecedorBlf = fornecedorBlf;
        this.usuarioBlf = usuarioBlf;
        this.dataCompraBlf = dataCompraBlf;
        this.totalCompraBlf = totalCompraBlf;
        
    }
   
     @Id 

    
    @Column(name="id_compra_blf", unique=true, nullable=false)
    public int getIdCompraBlf() {
        return this.idCompraBlf;
    }
    
    public void setIdCompraBlf(int idCompraBlf) {
        this.idCompraBlf = idCompraBlf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fornecedor", nullable=false)
    public FornecedorBlf getFornecedorBlf() {
        return this.fornecedorBlf;
    }
    
    public void setFornecedorBlf(FornecedorBlf fornecedorBlf) {
        this.fornecedorBlf = fornecedorBlf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario", nullable=false)
    public UsuarioBlf getUsuarioBlf() {
        return this.usuarioBlf;
    }
    
    public void setUsuarioBlf(UsuarioBlf usuarioBlf) {
        this.usuarioBlf = usuarioBlf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataCompra_blf", nullable=false, length=10)
    public Date getDataCompraBlf() {
        return this.dataCompraBlf;
    }
    
    public void setDataCompraBlf(Date dataCompraBlf) {
        this.dataCompraBlf = dataCompraBlf;
    }

    
    @Column(name="totalCompra_blf", nullable=false, precision=10)
    public double getTotalCompraBlf() {
        return this.totalCompraBlf;
    }
    
    public void setTotalCompraBlf(double totalCompraBlf) {
        this.totalCompraBlf = totalCompraBlf;
    }

    
   
}


