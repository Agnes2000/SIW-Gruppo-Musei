package it.uniroma3.siw.musei.repository;

import org.springframework.data.repository.CrudRepository;


import it.uniroma3.siw.musei.model.Utente;


public interface UtenteRepository extends CrudRepository<Utente, Long> {
    
}
