package edu.br.torneio.model.dao;

import edu.br.torneio.model.entities.UserInfo;
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
public class UserInfoDAO implements GenericDAO<UserInfo>{
    
    @PersistenceContext(unitName = "TorneioMarvel_LP3UP", type = PersistenceContextType.TRANSACTION)
    
    private EntityManager em;

    @Override
    public void persist(UserInfo e) {
        em.persist(e);
    }

    @Override
    public List<UserInfo> find() {
        return em.createQuery("SELECT u FROM UserInfo u").getResultList();
    }

    @Override
    public UserInfo findById(long id) {
        return em.find(UserInfo.class, id);
    }

    @Override
    public void remove(UserInfo e) {
        em.remove(e);
    }
    
}

