package edu.br.torneio.model.dao;

import edu.br.torneio.model.entities.MarvelMatch;
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
public class MarvelMatchDAO implements GenericDAO<MarvelMatch>{
    
    @PersistenceContext(unitName = "TorneioMarvel_LP3UP", type=PersistenceContextType.TRANSACTION)
    private EntityManager em;

    @Override
    public void persist(MarvelMatch e) {
        em.persist(e);
    }

    @Override
    public List<MarvelMatch> find() {
        return em.createQuery("SELECT u FROM MarvelMatch u").getResultList();
    }

    @Override
    public MarvelMatch findById(long id) {
        return em.find(MarvelMatch.class, id);
    }

    @Override
    public void remove(MarvelMatch e) {
        em.remove(e);
    }
    
}
