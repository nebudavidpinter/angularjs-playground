package com.example.angularjs.rest.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/greeting2")
    public Greeting greeting2(@RequestParam(value="namez", defaultValue="Worldz") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/greeting3")
    public Greeting greeting3(@RequestParam(value="namez", defaultValue="Worldz") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

	@RequestMapping("/greeting4")
	public Greeting greeting4(@RequestParam(value="namez", defaultValue="Worldz") String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
}