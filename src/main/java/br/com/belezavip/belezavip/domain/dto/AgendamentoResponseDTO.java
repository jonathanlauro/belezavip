package br.com.belezavip.belezavip.domain.dto;

import br.com.belezavip.belezavip.entity.Servicos;
import br.com.belezavip.belezavip.entity.Usuario;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class AgendamentoResponseDTO {
    private Integer id;
    private Usuario cliente;
    private Servicos servico;
    private String dataEHora;

    public AgendamentoResponseDTO() {
        this(null,null,null,null);
    }

    public AgendamentoResponseDTO(Integer id, Usuario cliente, Servicos servico, String dataEHora) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.dataEHora = dataEHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public String getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(String dataEHora) {
        this.dataEHora = dataEHora;
    }
}
