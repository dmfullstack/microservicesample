package com.frank.auth.domain;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_access_token")
public class AccessToken {
	 @Id
	 @Column(name = "token_id")
	private String tokenid;
	
	private Blob token;
	@Column(name = "authentication_id")
	private String authenticationid;
	@Column(name = "user_name")
	private String username;
	@Column(name = "client_id")
	private String clientid;
	
	private String authentication;
	@Column(name = "refresh_token")
	private String refreshToken;
	public String getTokenid() {
		return tokenid;
	}
	public void setTokenid(String tokenid) {
		this.tokenid = tokenid;
	}
	public Blob getToken() {
		return token;
	}
	public void setToken(Blob token) {
		this.token = token;
	}
	public String getAuthenticationid() {
		return authenticationid;
	}
	public void setAuthenticationid(String authenticationid) {
		this.authenticationid = authenticationid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getAuthentication() {
		return authentication;
	}
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	

}
