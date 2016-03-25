/**
 *
 */
package com.github.hartorn.dd.webapp.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hartorn.dd.webapp.model.generated.Actions;

/**
 * @author Hartorn
 *
 */
@Service
@Transactional
public class ActionService {
	private final static Logger LOG = LoggerFactory.getLogger(ActionService.class);

	@Autowired
	private ActionsDao actionDao;

	/**
	 *
	 * @return
	 */
	public Iterable<Actions> findAll() {
		return this.actionDao.findAll();
	};
}
