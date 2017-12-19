package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the round_scores database table.
 * 
 */
@Embeddable
public class RoundScorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="round_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int roundId;

	@Column(name="account_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int accountId;

	public RoundScorePK() {
	}
	public int getRoundId() {
		return this.roundId;
	}
	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}
	public int getAccountId() {
		return this.accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoundScorePK)) {
			return false;
		}
		RoundScorePK castOther = (RoundScorePK)other;
		return 
			(this.roundId == castOther.roundId)
			&& (this.accountId == castOther.accountId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roundId;
		hash = hash * prime + this.accountId;
		
		return hash;
	}
}