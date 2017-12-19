package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the account_event_status database table.
 * 
 */
@Embeddable
public class AccountEventStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="account_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int accountId;

	@Column(name="event_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int eventId;

	public AccountEventStatusPK() {
	}
	public int getAccountId() {
		return this.accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getEventId() {
		return this.eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccountEventStatusPK)) {
			return false;
		}
		AccountEventStatusPK castOther = (AccountEventStatusPK)other;
		return 
			(this.accountId == castOther.accountId)
			&& (this.eventId == castOther.eventId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accountId;
		hash = hash * prime + this.eventId;
		
		return hash;
	}
}