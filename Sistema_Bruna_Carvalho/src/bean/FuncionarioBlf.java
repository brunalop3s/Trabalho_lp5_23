package bean;
// Generated 15/09/2023 22:23:57 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FuncionarioBlf generated by hbm2java
 */
@Entity
@Table(name="funcionario_blf"
    ,catalog="db_bruna_carvalho"
)
public class FuncionarioBlf  implements java.io.Serializable {


     private int idFuncionarioBlf;
     private String nomeBlf;
     private String apelidoBlf;
     private String sexoBlf;
     private Date dataNascimentoBlf;
     private String cpfBlf;
     private String celularBlf;
     private String telefoneResidencialBlf;
     private String cepBlf;
     private String enderecoBlf;
     private String bairroBlf;
     private String cidadeBlf;
     private String ufBlf;
     private String emailBlf;
     private String ativoBlf;

    public FuncionarioBlf() {
    }

    public FuncionarioBlf(int idFuncionarioBlf, String nomeBlf, String apelidoBlf, String sexoBlf, Date dataNascimentoBlf, String cpfBlf, String celularBlf, String telefoneResidencialBlf, String cepBlf, String enderecoBlf, String bairroBlf, String cidadeBlf, String ufBlf, String emailBlf, String ativoBlf) {
       this.idFuncionarioBlf = idFuncionarioBlf;
       this.nomeBlf = nomeBlf;
       this.apelidoBlf = apelidoBlf;
       this.sexoBlf = sexoBlf;
       this.dataNascimentoBlf = dataNascimentoBlf;
       this.cpfBlf = cpfBlf;
       this.celularBlf = celularBlf;
       this.telefoneResidencialBlf = telefoneResidencialBlf;
       this.cepBlf = cepBlf;
       this.enderecoBlf = enderecoBlf;
       this.bairroBlf = bairroBlf;
       this.cidadeBlf = cidadeBlf;
       this.ufBlf = ufBlf;
       this.emailBlf = emailBlf;
       this.ativoBlf = ativoBlf;
    }
   
     @Id 

    
    @Column(name="id_funcionario_blf", unique=true, nullable=false)
    public int getIdFuncionarioBlf() {
        return this.idFuncionarioBlf;
    }
    
    public void setIdFuncionarioBlf(int idFuncionarioBlf) {
        this.idFuncionarioBlf = idFuncionarioBlf;
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

    
    @Column(name="sexo_blf", nullable=false, length=10)
    public String getSexoBlf() {
        return this.sexoBlf;
    }
    
    public void setSexoBlf(String sexoBlf) {
        this.sexoBlf = sexoBlf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento_blf", nullable=false, length=10)
    public Date getDataNascimentoBlf() {
        return this.dataNascimentoBlf;
    }
    
    public void setDataNascimentoBlf(Date dataNascimentoBlf) {
        this.dataNascimentoBlf = dataNascimentoBlf;
    }

    
    @Column(name="cpf_blf", nullable=false, length=11)
    public String getCpfBlf() {
        return this.cpfBlf;
    }
    
    public void setCpfBlf(String cpfBlf) {
        this.cpfBlf = cpfBlf;
    }

    
    @Column(name="celular_blf", nullable=false, length=9)
    public String getCelularBlf() {
        return this.celularBlf;
    }
    
    public void setCelularBlf(String celularBlf) {
        this.celularBlf = celularBlf;
    }

    
    @Column(name="telefoneResidencial_blf", nullable=false, length=8)
    public String getTelefoneResidencialBlf() {
        return this.telefoneResidencialBlf;
    }
    
    public void setTelefoneResidencialBlf(String telefoneResidencialBlf) {
        this.telefoneResidencialBlf = telefoneResidencialBlf;
    }

    
    @Column(name="cep_blf", nullable=false, length=9)
    public String getCepBlf() {
        return this.cepBlf;
    }
    
    public void setCepBlf(String cepBlf) {
        this.cepBlf = cepBlf;
    }

    
    @Column(name="endereco_blf", nullable=false, length=40)
    public String getEnderecoBlf() {
        return this.enderecoBlf;
    }
    
    public void setEnderecoBlf(String enderecoBlf) {
        this.enderecoBlf = enderecoBlf;
    }

    
    @Column(name="bairro_blf", nullable=false, length=25)
    public String getBairroBlf() {
        return this.bairroBlf;
    }
    
    public void setBairroBlf(String bairroBlf) {
        this.bairroBlf = bairroBlf;
    }

    
    @Column(name="cidade_blf", nullable=false, length=25)
    public String getCidadeBlf() {
        return this.cidadeBlf;
    }
    
    public void setCidadeBlf(String cidadeBlf) {
        this.cidadeBlf = cidadeBlf;
    }

    
    @Column(name="uf_blf", nullable=false, length=2)
    public String getUfBlf() {
        return this.ufBlf;
    }
    
    public void setUfBlf(String ufBlf) {
        this.ufBlf = ufBlf;
    }

    
    @Column(name="email_blf", nullable=false, length=45)
    public String getEmailBlf() {
        return this.emailBlf;
    }
    
    public void setEmailBlf(String emailBlf) {
        this.emailBlf = emailBlf;
    }

    
    @Column(name="ativo_blf", nullable=false, length=1)
    public String getAtivoBlf() {
        return this.ativoBlf;
    }
    
    public void setAtivoBlf(String ativoBlf) {
        this.ativoBlf = ativoBlf;
    }




}


