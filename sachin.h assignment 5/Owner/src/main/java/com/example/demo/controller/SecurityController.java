package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.JwtUtil.JwtUtil;
import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.AuthenticationResponse;

@RestController
public class SecurityController {

	@Autowired
	private UserDetailsService userDetailsService;
    @Autowired
	private  AuthenticationManager authenticationManager;
    @Autowired
	private JwtUtil jwtTokenUtil;
   
	@RequestMapping(value ="/authenticate",method= RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest ) throws Exception{
        try {
		authenticationManager.authenticate(
             new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
	} 
        catch(BadCredentialsException e) {
		throw new Exception("incorrect username or password",e);
        }
    	final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
    	final String jwt= jwtTokenUtil.generateToken(userDetails);
    	return ResponseEntity.ok(new AuthenticationResponse(jwt));
    	
    }
}
