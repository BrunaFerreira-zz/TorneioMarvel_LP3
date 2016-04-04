/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.br.torneio.model.dao;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Bruna
 */
@Local
public interface GenericDAO<E>{
    public void persist (E e);
    public List<E> find();
    public E findById(long id);
    public void remove(E e);    
}
