/*
 * Serviço para acessar os recursos disponibilizados pelos nó da rede
 */
package com.tads.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Lucas
 * 
 */

@Path("/node")
public class ServicoNode {
    
    @GET
    //@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public /*Response*/ void comunicaNode() {
        return;
    }
    
}
