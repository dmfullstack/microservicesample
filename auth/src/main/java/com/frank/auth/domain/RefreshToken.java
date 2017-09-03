package com.frank.auth.domain;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_refresh_token")
public class RefreshToken {
	 @Id
	 @Column(name = "token_id")
	private String tokenid;
	
	private Blob token;
	private String authentication;
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
	public String getAuthentication() {
		return authentication;
	}
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
	
	
}
