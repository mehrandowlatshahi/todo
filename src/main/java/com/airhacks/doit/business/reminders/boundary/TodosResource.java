/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.doit.business.reminders.boundary;

import com.airhacks.doit.business.reminders.entity.ToDo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author ciran_000
 */
@Path("todos")
public class TodosResource {
    
    @GET
    public ToDo hello(){
        return new ToDo("impl rest endpoint","...", 100);
    }
}
