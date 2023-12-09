package bean;
// Generated 27/10/2023 20:56:57 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuarioBlf generated by hbm2java
 */
@Entity
@Table(name="usuario_blf"
    ,catalog="db_bruna_carvalho"
)
public class UsuarioBlf  implements java.io.Serializable {


     private int idUsuarioBlf;
     private String nomeBlf;
     private String apelidoBlf;
     private String cpfBlf;
     private Date dataNascimentoBlf;
     private String senhaBlf;
     private int nivelBlf;
     private String ativoBlf;
     

    public UsuarioBlf() {
    }

	
    public UsuarioBlf(int idUsuarioBlf, String nomeBlf, String apelidoBlf, String cpfBlf, Date dataNascimentoBlf, String senhaBlf, int nivelBlf) {
        this.idUsuarioBlf = idUsuarioBlf;
        this.nomeBlf = nomeBlf;
        this.apelidoBlf = apelidoBlf;
        this.cpfBlf = cpfBlf;
        this.dataNascimentoBlf = dataNascimentoBlf;
        this.senhaBlf = senhaBlf;
        this.nivelBlf = nivelBlf;
    }
    public UsuarioBlf(int idUsuarioBlf, String nomeBlf, String apelidoBlf, String cpfBlf, Date dataNascimentoBlf, String senhaBlf, int nivelBlf, String ativoBlf) {
       this.idUsuarioBlf = idUsuarioBlf;
       this.nomeBlf = nomeBlf;
       this.apelidoBlf = apelidoBlf;
       this.cpfBlf = cpfBlf;
       this.dataNascimentoBlf = dataNascimentoBlf;
       this.senhaBlf = senhaBlf;
       this.nivelBlf = nivelBlf;
       this.ativoBlf = ativoBlf;
     
    }
   
     @Id 

    
    @Column(name="id_usuario_blf", unique=true, nullable=false)
    public int getIdUsuarioBlf() {
        return this.idUsuarioBlf;
    }
    
    public void setIdUsuarioBlf(int idUsuarioBlf) {
        this.idUsuarioBlf = idUsuarioBlf;
    }

    
    @Column(name="nome_blf", nullable=false, length=45)
    public String getNomeBlf() {
        return this.nomeBlf;
    }
    
    public void setNomeBlf(String nomeBlf) {
        this.nomeBlf = nomeBlf;
    }

    
    @Column(name="apelido_blf", nullable=false, length=45)
    public String getApelidoBlf() {
        return this.apelidoBlf;
    }
    
    public void setApelidoBlf(String apelidoBlf) {
        this.apelidoBlf = apelidoBlf;
    }

    
    @Column(name="cpf_blf", nullable=false, length=15)
    public String getCpfBlf() {
        return this.cpfBlf;
    }
    
    public void setCpfBlf(String cpfBlf) {
        this.cpfBlf = cpfBlf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento_blf", nullable=false, length=10)
    public Date getDataNascimentoBlf() {
        return this.dataNascimentoBlf;
    }
    
    public void setDataNascimentoBlf(Date dataNascimentoBlf) {
        this.dataNascimentoBlf = dataNascimentoBlf;
    }

    
    @Column(name="senha_blf", nullable=false, length=15)
    public String getSenhaBlf() {
        return this.senhaBlf;
    }
    
    public void setSenhaBlf(String senhaBlf) {
        this.senhaBlf = senhaBlf;
    }

    
    @Column(name="nivel_blf", nullable=false)
    public int getNivelBlf() {
        return this.nivelBlf;
    }
    
    public void setNivelBlf(int nivelBlf) {
        this.nivelBlf = nivelBlf;
    }

    
    @Column(name="ativo_blf", length=1)
    public String getAtivoBlf() {
        return this.ativoBlf;
    }
    
    public void setAtivoBlf(String ativoBlf) {
        this.ativoBlf = ativoBlf;
    }


    public String toString() {
        return getNomeBlf();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof UsuarioBlf) {
            UsuarioBlf usuarioBlf = (UsuarioBlf) object;
            if (this.getIdUsuarioBlf()== usuarioBlf.getIdUsuarioBlf()) {
                    return true;
            } 
        }
         return false;
    
    }


}


