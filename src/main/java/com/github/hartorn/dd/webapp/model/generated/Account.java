package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the accounts database table.
 * 
 */
@Entity
@Table(name="accounts")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="twitch_id", unique=true, nullable=false)
	private int twitchId;

	@Column(name="broadcaster_type", nullable=false, length=1)
	private String broadcasterType;

	@Column(nullable=false, length=320)
	private String email;

	@Column(name="email_activation_key", length=36)
	private String emailActivationKey;

	@Column(nullable=false)
	private int followers;

	@Column(nullable=false)
	private int grade;

	@Column(length=512)
	private String logo;

	@Column(nullable=false, length=512)
	private String url;

	@Column(nullable=false, length=40)
	private String username;

	@Column(nullable=false)
	private int views;

	//bi-directional many-to-one association to AccountEventStatus
	@OneToMany(mappedBy="account")
	private List<AccountEventStatus> accountEventStatuses;

	//bi-directional many-to-one association to AuthToken
	@OneToMany(mappedBy="account")
	private List<AuthToken> authTokens;

	//bi-directional many-to-one association to RoundScore
	@OneToMany(mappedBy="account")
	private List<RoundScore> roundScores;

	public Account() {
	}

	public int getTwitchId() {
		return this.twitchId;
	}

	public void setTwitchId(int twitchId) {
		this.twitchId = twitchId;
	}

	public String getBroadcasterType() {
		return this.broadcasterType;
	}

	public void setBroadcasterType(String broadcasterType) {
		this.broadcasterType = broadcasterType;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailActivationKey() {
		return this.emailActivationKey;
	}

	public void setEmailActivationKey(String emailActivationKey) {
		this.emailActivationKey = emailActivationKey;
	}

	public int getFollowers() {
		return this.followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public List<AccountEventStatus> getAccountEventStatuses() {
		return this.accountEventStatuses;
	}

	public void setAccountEventStatuses(List<AccountEventStatus> accountEventStatuses) {
		this.accountEventStatuses = accountEventStatuses;
	}

	public AccountEventStatus addAccountEventStatus(AccountEventStatus accountEventStatus) {
		getAccountEventStatuses().add(accountEventStatus);
		accountEventStatus.setAccount(this);

		return accountEventStatus;
	}

	public AccountEventStatus removeAccountEventStatus(AccountEventStatus accountEventStatus) {
		getAccountEventStatuses().remove(accountEventStatus);
		accountEventStatus.setAccount(null);

		return accountEventStatus;
	}

	public List<AuthToken> getAuthTokens() {
		return this.authTokens;
	}

	public void setAuthTokens(List<AuthToken> authTokens) {
		this.authTokens = authTokens;
	}

	public AuthToken addAuthToken(AuthToken authToken) {
		getAuthTokens().add(authToken);
		authToken.setAccount(this);

		return authToken;
	}

	public AuthToken removeAuthToken(AuthToken authToken) {
		getAuthTokens().remove(authToken);
		authToken.setAccount(null);

		return authToken;
	}

	public List<RoundScore> getRoundScores() {
		return this.roundScores;
	}

	public void setRoundScores(List<RoundScore> roundScores) {
		this.roundScores = roundScores;
	}

	public RoundScore addRoundScore(RoundScore roundScore) {
		getRoundScores().add(roundScore);
		roundScore.setAccount(this);

		return roundScore;
	}

	public RoundScore removeRoundScore(RoundScore roundScore) {
		getRoundScores().remove(roundScore);
		roundScore.setAccount(null);

		return roundScore;
	}

}