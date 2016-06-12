/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.doit.business.reminders.boundary;

import com.airhacks.doit.business.reminders.entity.ToDo;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author ciran_000
 */
@Stateless
@Path("todos")
public class TodosResource {
    
    @Inject
    ToDoManager mgr;
    
    @GET
    @Path("{id}")
    public ToDo find(@PathParam("id") long id){
        return this.mgr.find(id);
        //return new ToDo("implement rest endpoint "+id, " "+id, 100);
    }
    
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id){
        //System.out.print(" deleted "+id);
        mgr.delete(id);
    }
    
    @GET
    public List<ToDo> all(){
        return mgr.all();
    }
    
    @POST
    public void save(ToDo td){
        
        mgr.mysave(td, ""+td.getClass());
    }
}
