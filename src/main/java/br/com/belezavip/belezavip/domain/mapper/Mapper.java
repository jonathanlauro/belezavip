package br.com.belezavip.belezavip.domain.mapper;

import java.text.ParseException;
import java.util.List;

public interface Mapper <E,M>{

    M toModel(E entidade);

    E toEntidade(M model) throws ParseException;

    List<M> toListModel(List<E> entidades);

    List<E> toListEntidade(List<M> models);
}
