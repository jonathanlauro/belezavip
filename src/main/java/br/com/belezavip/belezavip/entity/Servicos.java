package br.com.belezavip.belezavip.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_servicos")
public class Servicos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao_servico")
    private String descServico;

    private Float valor;

    private String duracao;

    public Servicos() {
        this(null,null,null,null);
    }

    public Servicos(Integer id, String descServico, Float valor, String duracao) {
        this.id = id;
        this.descServico = descServico;
        this.valor = valor;
        this.duracao = duracao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescServico() {
        return descServico;
    }

    public void setDescServico(String descServico) {
        this.descServico = descServico;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
