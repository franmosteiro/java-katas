package io.github.franmosteiro.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreeterShould {

	@Test
	void greet_with_a_hello_message_to_the_name_it_receives() {
		Greeter greeter = new Greeter();
		assertEquals("Hello Fran", greeter.greet("Fran"));
	}

}