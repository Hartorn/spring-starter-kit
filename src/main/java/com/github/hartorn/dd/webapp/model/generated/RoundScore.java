package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the round_scores database table.
 * 
 */
@Entity
@Table(name="round_scores")
@NamedQuery(name="RoundScore.findAll", query="SELECT r FROM RoundScore r")
public class RoundScore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoundScorePK id;

	@Column(nullable=false)
	private int score;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_id", nullable=false, insertable=false, updatable=false)
	private Account account;

	//bi-directional many-to-one association to EventRound
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="round_id", nullable=false, insertable=false, updatable=false)
	private EventRound eventRound;

	public RoundScore() {
	}

	public RoundScorePK getId() {
		return this.id;
	}

	public void setId(RoundScorePK id) {
		this.id = id;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public EventRound getEventRound() {
		return this.eventRound;
	}

	public void setEventRound(EventRound eventRound) {
		this.eventRound = eventRound;
	}

}