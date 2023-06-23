package it.uniroma3.siw.musei.repository;

import org.springframework.data.repository.CrudRepository;


import it.uniroma3.siw.musei.model.Luogo;


public interface LuogoRepository extends CrudRepository<Luogo, Long> {
   
    public boolean existsByNomeAndCitta(String nome, String citta);

}
