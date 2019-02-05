/**
 * 
 */
package com.prady.sample.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prady
 *
 */
@RestController
public class HelloController {
	private static final String template = "Hello, %s !";

	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format(template, name);
	}
}
