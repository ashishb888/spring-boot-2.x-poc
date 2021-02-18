package poc.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

	@GetMapping
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello there");
	}
}
