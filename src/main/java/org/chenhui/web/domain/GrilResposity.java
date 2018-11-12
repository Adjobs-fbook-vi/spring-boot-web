package org.chenhui.web.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrilResposity extends JpaRepository<Gril, Integer>{
	
}
