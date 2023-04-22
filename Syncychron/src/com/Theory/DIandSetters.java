package com.Theory;

public class DIandSetters {

	//@Bean and @AutoWire diff'
	
//	@Bean tells Spring 'here is an instance of this class, please keep hold of it and give it back to me when I ask'.

	//@Autowired says 'please give me an instance of this class, for example, one that I created with an @Bean annotation earlier'.

	//Does that make sense? In your first example, you're asking Spring to give you an instance of BookingService, but you're never creating one, so Spring has nothing to give you. In your second example, you're creating a new instance of BookingService, telling Spring about it, and then, in the main() method, asking for it back.

//@RestController and @Controller 
}
