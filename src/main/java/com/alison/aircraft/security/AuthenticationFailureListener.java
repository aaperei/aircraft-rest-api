package com.alison.aircraft.security;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFailureListener implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {
	
	@Override
	public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent e) {
		Authentication auth = e.getAuthentication();
		System.out.println("Login failed: " + auth.getName());
	}
}