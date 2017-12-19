package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the event_rounds database table.
 * 
 */
@Entity
@Table(name="event_rounds")
@NamedQuery(name="EventRound.findAll", query="SELECT e FROM EventRound e")
public class EventRound implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="round_id", unique=true, nullable=false)
	private int roundId;

	//bi-directional many-to-one association to Event
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id", nullable=false)
	private Event event;

	//bi-directional many-to-one association to RoundScore
	@OneToMany(mappedBy="eventRound")
	private List<RoundScore> roundScores;

	public EventRound() {
	}

	public int getRoundId() {
		return this.roundId;
	}

	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<RoundScore> getRoundScores() {
		return this.roundScores;
	}

	public void setRoundScores(List<RoundScore> roundScores) {
		this.roundScores = roundScores;
	}

	public RoundScore addRoundScore(RoundScore roundScore) {
		getRoundScores().add(roundScore);
		roundScore.setEventRound(this);

		return roundScore;
	}

	public RoundScore removeRoundScore(RoundScore roundScore) {
		getRoundScores().remove(roundScore);
		roundScore.setEventRound(null);

		return roundScore;
	}

}