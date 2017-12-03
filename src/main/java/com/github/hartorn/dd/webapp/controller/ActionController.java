/**
 *
 */
package com.github.hartorn.dd.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.hartorn.dd.webapp.model.ActionService;
import com.github.hartorn.dd.webapp.model.generated.Actions;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author Hartorn
 *
 */
@RestController
@Log4j2
@RequiredArgsConstructor
public class ActionController {

    private final ActionService actionService;

	@RequestMapping(method = RequestMethod.GET, path = "/actions")
	public Iterable<Actions> greeting() {
        log.info("Calling findAll");
		return this.actionService.findAll();
	}

}
