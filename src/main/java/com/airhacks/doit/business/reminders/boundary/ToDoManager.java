/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.doit.business.reminders.boundary;

import com.airhacks.doit.business.reminders.entity.ToDo;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ciran_000
 */
@Stateless
public class ToDoManager {
    
    @PersistenceContext(unitName = "prod")
    EntityManager em;
    ToDo find(long id) {
        return em.find(ToDo.class, id);
    }

    void delete(long id) {
        ToDo r = em.find(ToDo.class, id);
        em.remove(r);
    }

    List<ToDo> all() {
        return em.createNamedQuery(ToDo.findAll, ToDo.class).getResultList();
        
    }

    void mysave(ToDo td, String tdclass) {
        try{
        this.em.merge(td);
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        
    }
    
}
