package hellospringboot.memories.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hellospringboot.memories.model.Memory;

@RestController
public class MemoriesController {
	List<Memory> memories = new ArrayList<Memory>();

	@GetMapping("/")
	public String helloWorld() {
		return "lindos";
	}
	
	@GetMapping("/memories")
	public List<Memory> index() {
		return memories;
	}

	@RequestMapping(value = "/memories", method = POST)
	public ResponseEntity<Memory> create(@RequestBody Memory memory) {
		memories.add(memory);
        return new ResponseEntity<Memory>(memory, HttpStatus.CREATED);
	}
}
