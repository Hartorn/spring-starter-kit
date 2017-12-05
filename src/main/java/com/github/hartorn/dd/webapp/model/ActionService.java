/**
 *
 */
package com.github.hartorn.dd.webapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hartorn.dd.webapp.model.generated.Actions;
import com.github.hartorn.dd.webapp.model.generated.QActions;

import lombok.extern.log4j.Log4j2;

/**
 * @author Hartorn
 *
 */
@Service
@Transactional
@Log4j2
public class ActionService {

    @Autowired
    private ActionsDao actionDao;

    /**
     *
     * @return
     */
    public Iterable<Actions> findAll() {
        return this.actionDao.findAll();
    };

    /**
    *
    * @return
    */
    public Iterable<Actions> findAllByCriteria() {
        return this.actionDao.findAll(QActions.actions.xp.goe(10));
    };
}
