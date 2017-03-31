package rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class GreetingController {

	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();
	    
	    @RequestMapping(path="/greeting", method={RequestMethod.GET})
	    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return "Hello " + name;
	        }
	        
	    @RequestMapping(path="/greeting/{name}", method={RequestMethod.GET})
	    public String greeting2(@PathVariable(value="name") String name) {
	        return "Hello " + name;
	        }
	}

