package com.mouritech.springbootsecuritywithroles.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	private static final String CEO = "CEO";
	private static final String SalesPerson = "SalesPerson";
	private static final String Manager = "Manager";
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http1) throws Exception {
		http1.authorizeRequests().antMatchers("/staff").hasRole(CEO)
								 .antMatchers("/updatestaff/{sid}").hasAnyRole(CEO,SalesPerson)
								 .antMatchers("/updatesalary/{sid}").hasAnyRole(CEO,Manager)
								 .antMatchers("/all").permitAll()
								 .and().formLogin();
		}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
