package org.chenhui.web.service;

import org.chenhui.web.domain.Gril;
import org.chenhui.web.domain.GrilResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class GrilService {
	@Autowired
	private GrilResposity grilResposity;
	
	public Gril getOne(Integer id) {
		return grilResposity.getOne(id);
	}
}
