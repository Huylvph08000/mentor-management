package com.vti.mentormanagement.payload.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;
@Getter
@Setter
public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String firtName;
	private String lastName;
	private String userName;
	private String email;
	private String status;
	private List<String> roles;

	public JwtResponse(String firstName, String lastName,String accessToken, Long id, String userName, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
		this.firtName = firstName;
		this.lastName = lastName;
	}

	public JwtResponse( Long id, String userName, String email, String lastName, String firstName, String status, String jwt, List<String> roles) {
		this.token = jwt;
		this.status = status;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
		this.firtName = firstName;
		this.lastName = lastName;
	}


	public JwtResponse(Long id, String userName, String email, String lastName, String firstName, String status, String password, Collection<? extends GrantedAuthority> authorities, String jwt, List<String> roles) {
		this.token = jwt;
		this.status = status;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
		this.firtName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}
}
