package br.com.belezavip.belezavip.domain.mapper;

import br.com.belezavip.belezavip.domain.dto.AgendamentoDTO;
import br.com.belezavip.belezavip.domain.dto.AgendamentoResponseDTO;
import br.com.belezavip.belezavip.entity.Agendamento;
import br.com.belezavip.belezavip.entity.Servicos;
import br.com.belezavip.belezavip.entity.Usuario;
import br.com.belezavip.belezavip.repository.ServicosRepository;
import br.com.belezavip.belezavip.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static br.com.belezavip.belezavip.utils.ConversorDeDatas.ConverterStringToDate;
import static br.com.belezavip.belezavip.utils.ConversorDeDatas.converterDateToStrig;
import static java.util.Objects.isNull;

@Service
public class AgendamentoMapper{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ServicosRepository servicosRepository;

    public AgendamentoDTO toModel(Agendamento entidade) {
        return null;
    }

    public Agendamento toEntidade(AgendamentoDTO model) throws ParseException {
        Usuario busca = usuarioRepository.findByEmail(model.getEmail());
        if(isNull(busca)){
            throw new Error("usuario nao encontrado");
        }
        Servicos buscaServico = servicosRepository.findById(model.getIdServico());

        return new Agendamento(model.getId(),busca,buscaServico,ConverterStringToDate(model.getDiaServico()));
    }


    public List<AgendamentoResponseDTO> toListModels(List<Agendamento> entidades) {
        List<AgendamentoResponseDTO> toListModels = new ArrayList<>();
        entidades.forEach(entidade -> {
            toListModels.add(new AgendamentoResponseDTO(entidade.getId(),entidade.getCliente(),entidade.getServico(),converterDateToStrig(entidade.getDataEHora())));
        });
        return toListModels;
    }
}
