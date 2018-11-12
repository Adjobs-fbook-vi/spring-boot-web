package org.chenhui.web.controller;

import org.chenhui.web.domain.Gril;
import org.chenhui.web.service.GrilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrilController {
	@Autowired
	private GrilService grilService;
	
	@RequestMapping("gril/find/{id}")
	public Gril getOne(@PathVariable("id") Integer id) {
		Gril one = grilService.getOne(id);
		return one;
	}
}
