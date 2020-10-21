package br.com.codigio.colosso.services;

import java.util.List;

import br.com.codigio.colosso.dao.GroupDao;
import br.com.codigio.colosso.model.Group;

public class GroupService {
	private GroupDao groupDao = new GroupDao();
	
	public List<Group> findAll() {
		return groupDao.findAll();
	}
}
