package com.wsmytraining.models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="TB_TREINO")
public class Treino {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String repeticao; // PODE RETORNAR UMA DATA OU UM DIA DA SEMANA
    private Integer status; // 0 = INATIVO | 1 = ATIVO
    private Integer idCliente;
    private String ultimaDataAtualizacao;
    private String descricao;
    private String atividades; //1;5;7;6;2;7
    private String observacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getUltimaDataAtualizacao() {
        return ultimaDataAtualizacao;
    }

    public void setUltimaDataAtualizacao(String ultimaDataAtualizacao) {
        this.ultimaDataAtualizacao = ultimaDataAtualizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    

    
    
    
    
    
    
    
    
    
}
