package poc.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poc.springboot.domain.Sample;

@RequestMapping("/sample")
@RestController
public class SampleRestController {

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
			MediaType.TEXT_PLAIN_VALUE, MediaType.TEXT_XML_VALUE })
	// MediaType.TEXT_PLAIN_VALUE ---> will not work --->No converter
	public Sample produceMany() {
		return new Sample(1, "A B");
	}
}
