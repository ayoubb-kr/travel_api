package com.saad.pays;

import com.saad.pays.entities.Visa;
import com.saad.pays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.saad.pays.entities.Passport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringfinalprojectApplication implements CommandLineRunner{

	@Autowired
	UserService userService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration ;

	public static void main(String[] args) {
		SpringApplication.run(SpringfinalprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Visa.class, Passport.class);
		
	}

/*
	@PostConstruct
	void init_users() {
		userService.addRole(new Role(null,"ADMIN")); userService.addRole(new
				Role(null,"USER"));

		userService.saveUser(new
				User(null,"admin","123",true,null)); userService.saveUser(new
				User(null,"nadhem","123",true,null)); userService.saveUser(new
				User(null,"yassine","123",true,null));
		userService.saveUser(new User(null,"ayoub","123",true,null));

		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "ADMIN");

		userService.addRoleToUser("ayoub", "ADMIN");
		userService.addRoleToUser("nadhem", "USER");
		userService.addRoleToUser("yassine", "USER"); }


*/


	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();

	}
}
