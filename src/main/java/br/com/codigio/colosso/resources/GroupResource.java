package br.com.codigio.colosso.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.codigio.colosso.model.Group;
import br.com.codigio.colosso.services.GroupService;

@Path("groups")
public class GroupResource {
	private GroupService groupService = new GroupService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Group> getGroups() {
		return groupService.findAll();
	}
}
