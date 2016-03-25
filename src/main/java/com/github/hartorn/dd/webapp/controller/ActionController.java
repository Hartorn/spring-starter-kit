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

/**
 * @author Hartorn
 *
 */
@RestController
public class ActionController {

	@Autowired
	private ActionService actionService;

	@RequestMapping(method = RequestMethod.GET, path = "/actions")
	public Iterable<Actions> greeting() {
		return this.actionService.findAll();
	}

}
