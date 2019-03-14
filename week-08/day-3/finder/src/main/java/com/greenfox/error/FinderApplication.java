package com.greenfox.error;

import com.greenfox.error.model.User;
import com.greenfox.error.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinderApplication implements CommandLineRunner {

	/*UserService userService;

	@Autowired
	public FinderApplication(UserService userService) {
		this.userService = userService;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(FinderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user1 = new User("Matyi", "Kicsi");
		User user2 = new User("Krisz", "Nagy");
		userService.save(user1);
		userService.save(user2);*/

	}
}
