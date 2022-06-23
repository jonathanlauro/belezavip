package br.com.belezavip.belezavip.domain.dto;

public class AgendamentoDTO {

    private Integer id;
    private int idServico;
    private String email;
    private String diaServico;

    public AgendamentoDTO() {
        this(null,0,null,null);
    }

    public AgendamentoDTO(Integer id, int idServico, String email, String diaServico) {
        this.id = id;
        this.idServico = idServico;
        this.email = email;
        this.diaServico = diaServico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaServico() {
        return diaServico;
    }

    public void setDiaServico(String diaServico) {
        this.diaServico = diaServico;
    }
}
