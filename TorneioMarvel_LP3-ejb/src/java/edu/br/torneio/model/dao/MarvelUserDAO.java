package edu.br.torneio.model.dao;

import edu.br.torneio.model.entities.MarvelUser;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author Bruna
 */
@Stateful
public class MarvelUserDAO implements GenericDAO<MarvelUser>{
    
    @PersistenceContext(unitName = "TorneioMarvel_LP3PU", type=PersistenceContextType.TRANSACTION)
    
    private EntityManager em;
    
    @Override
    public void persist(MarvelUser e) {
        em.persist(e);
    }

    @Override
    public List<MarvelUser> find() {
        return em.createQuery("SELECT u FROM MarvelUser u").getResultList();
    }

    @Override
    public MarvelUser findById(long id) {
        return em.find(MarvelUser.class, id);
    }

    @Override
    public void remove(MarvelUser e) {
        em.remove(e);
    }
    
}
