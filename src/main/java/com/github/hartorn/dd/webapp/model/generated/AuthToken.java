package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the auth_tokens database table.
 * 
 */
@Entity
@Table(name="auth_tokens")
@NamedQuery(name="AuthToken.findAll", query="SELECT a FROM AuthToken a")
public class AuthToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=60)
	private String token;

	@Column(name="last_used_timestamp", nullable=false)
	private BigInteger lastUsedTimestamp;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_id", nullable=false)
	private Account account;

	public AuthToken() {
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public BigInteger getLastUsedTimestamp() {
		return this.lastUsedTimestamp;
	}

	public void setLastUsedTimestamp(BigInteger lastUsedTimestamp) {
		this.lastUsedTimestamp = lastUsedTimestamp;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}