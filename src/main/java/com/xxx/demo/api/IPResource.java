package com.xxx.demo.api;

import com.xxx.demo.model.IP;
import com.xxx.demo.service.IPService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by slobolai on 8/22/2016.
 */
@Stateless
@Path("/ip")
public class IPResource {
    @Inject
    private IPService ipService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<IP> findAll() {
        List<IP> results = ipService.getAllIP();
        System.out.println(results);
        return results;
    }

}
