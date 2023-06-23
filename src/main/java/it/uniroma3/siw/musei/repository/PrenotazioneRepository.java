package it.uniroma3.siw.musei.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import it.uniroma3.siw.musei.model.Prenotazione;
import it.uniroma3.siw.musei.model.Utente;


public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

    public List<Prenotazione> findByAcquirente(Utente acquirente);
    
}
