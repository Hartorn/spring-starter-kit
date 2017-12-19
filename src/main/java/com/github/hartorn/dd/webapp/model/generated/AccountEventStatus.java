package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the account_event_status database table.
 * 
 */
@Entity
@Table(name="account_event_status")
@NamedQuery(name="AccountEventStatus.findAll", query="SELECT a FROM AccountEventStatus a")
public class AccountEventStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccountEventStatusPK id;

	@Column(name="email_activation_key", nullable=false, length=36)
	private String emailActivationKey;

	@Column(nullable=false, length=1)
	private String status;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_id", nullable=false, insertable=false, updatable=false)
	private Account account;

	//bi-directional many-to-one association to Event
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id", nullable=false, insertable=false, updatable=false)
	private Event event;

	public AccountEventStatus() {
	}

	public AccountEventStatusPK getId() {
		return this.id;
	}

	public void setId(AccountEventStatusPK id) {
		this.id = id;
	}

	public String getEmailActivationKey() {
		return this.emailActivationKey;
	}

	public void setEmailActivationKey(String emailActivationKey) {
		this.emailActivationKey = emailActivationKey;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}