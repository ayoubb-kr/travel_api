package com.vermeg.travel;

import com.vermeg.travel.entities.Role;
import com.vermeg.travel.entities.User;
import com.vermeg.travel.entities.Visa;
import com.vermeg.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.vermeg.travel.entities.Passport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;

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

  		userService.addRole(new Role(null,"ADMIN"));

  		userService.addRole(newRole(null,"USER"));

		userService.saveUser(new User(null,"admin","123",true,null,null));

		userService.saveUser(new User(null,"ayoub","123",true,null,null));


		userService.addRoleToUser("ayoub", "ADMIN");

/*
		userService.addRoleToUser("yassine", "USER");
		*/

	/*



	}

*/


	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();

	}
}
