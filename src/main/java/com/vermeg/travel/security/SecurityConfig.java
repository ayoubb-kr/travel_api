package com.vermeg.travel.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
				.passwordEncoder(bCryptPasswordEncoder);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);


		 // Permit access to users
		http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/passport").authenticated();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/api/user").authenticated();
		http.authorizeRequests().antMatchers(HttpMethod.PUT,"/api/passport").authenticated();

		//consulter tous les enitys

		 http.authorizeRequests().antMatchers("/api/all").hasAnyAuthority("ADMIN");
		 http.authorizeRequests().antMatchers("/api/**/all").hasAnyAuthority("ADMIN");

		  //consulter
		 http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/**").hasAnyAuthority("ADMIN","USER","TEAM_LEADER","AGENT_RH","TRAVEL_MANAGER");

		 //ajouter
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/api/**").hasAuthority("ADMIN");

		  //modifier
		 http.authorizeRequests().antMatchers(HttpMethod.PUT,"/api/**").hasAuthority("ADMIN");

		 //supprimer
		 http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/api/**").hasAuthority("ADMIN");



		 http.authorizeRequests().antMatchers("/login").permitAll();
		 http.authorizeRequests().antMatchers("/all").hasAuthority("ADMIN");

		 http.authorizeRequests().anyRequest().authenticated();
		 http.addFilter(new  JWTAuthenticationFilter (authenticationManager())) ;
		 http.addFilterBefore(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);

	}

 

 
}