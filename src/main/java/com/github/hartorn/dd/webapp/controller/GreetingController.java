package com.github.hartorn.dd.webapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	public class Greeting {

		private final long id;
		private final String content;

		public Greeting(final long id, final String content) {
			this.id = id;
			this.content = content;
		}

		public String getContent() {
			return this.content;
		}

		public long getId() {
			return this.id;
		}
	}

	private static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(method = RequestMethod.POST, path = "/create")
	public Greeting create() {
		return new Greeting(this.counter.incrementAndGet(), "nouveau");
	}

	@RequestMapping(method = RequestMethod.GET, path = "/greet")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
		return new Greeting(this.counter.incrementAndGet(), String.format(GreetingController.TEMPLATE, name));
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
	public Greeting hello(@PathVariable(value = "name") final String name) {
		return new Greeting(this.counter.incrementAndGet(), String.format(GreetingController.TEMPLATE, name));
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update/{id}")
	public Greeting update(@PathVariable(value = "id") final long id) {
		return new Greeting(id, "majs");
	}
}
