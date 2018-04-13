package rest.spring.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {
	
	// QueryParam
	@GetMapping("/opa")
	public Message getMessage(
			@RequestParam(value = "message", defaultValue = "World") 
			String message) {
		return new Message(message);
	}

	// PathParam
	@GetMapping("/message/{msg}")
	public Message getMessagePath(
			@PathVariable("msg") 
			String message) {
		return new Message(message);
	}
}
