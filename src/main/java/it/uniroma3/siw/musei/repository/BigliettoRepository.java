package it.uniroma3.siw.musei.repository;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.musei.model.Biglietto;
import it.uniroma3.siw.musei.model.Museo;


public interface BigliettoRepository extends CrudRepository<Biglietto, Long> {

    public boolean existsByNomeAndMuseo(String nome, Museo museo);

}
