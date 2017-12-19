package com.github.hartorn.dd.webapp.model.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="events")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=2048)
	private String description;

	@Column(name="is_current", nullable=false)
	private byte isCurrent;

	@Column(name="minimum_followers", nullable=false)
	private int minimumFollowers;

	@Column(name="minimum_views", nullable=false)
	private int minimumViews;

	@Column(nullable=false, length=200)
	private String name;

	@Column(name="reserved_to_affiliates", nullable=false)
	private byte reservedToAffiliates;

	@Column(name="reserved_to_partners", nullable=false)
	private byte reservedToPartners;

	@Column(nullable=false, length=1)
	private String status;

	//bi-directional many-to-one association to AccountEventStatus
	@OneToMany(mappedBy="event")
	private List<AccountEventStatus> accountEventStatuses;

	//bi-directional many-to-one association to EventRound
	@OneToMany(mappedBy="event")
	private List<EventRound> eventRounds;

	public Event() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(byte isCurrent) {
		this.isCurrent = isCurrent;
	}

	public int getMinimumFollowers() {
		return this.minimumFollowers;
	}

	public void setMinimumFollowers(int minimumFollowers) {
		this.minimumFollowers = minimumFollowers;
	}

	public int getMinimumViews() {
		return this.minimumViews;
	}

	public void setMinimumViews(int minimumViews) {
		this.minimumViews = minimumViews;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getReservedToAffiliates() {
		return this.reservedToAffiliates;
	}

	public void setReservedToAffiliates(byte reservedToAffiliates) {
		this.reservedToAffiliates = reservedToAffiliates;
	}

	public byte getReservedToPartners() {
		return this.reservedToPartners;
	}

	public void setReservedToPartners(byte reservedToPartners) {
		this.reservedToPartners = reservedToPartners;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<AccountEventStatus> getAccountEventStatuses() {
		return this.accountEventStatuses;
	}

	public void setAccountEventStatuses(List<AccountEventStatus> accountEventStatuses) {
		this.accountEventStatuses = accountEventStatuses;
	}

	public AccountEventStatus addAccountEventStatus(AccountEventStatus accountEventStatus) {
		getAccountEventStatuses().add(accountEventStatus);
		accountEventStatus.setEvent(this);

		return accountEventStatus;
	}

	public AccountEventStatus removeAccountEventStatus(AccountEventStatus accountEventStatus) {
		getAccountEventStatuses().remove(accountEventStatus);
		accountEventStatus.setEvent(null);

		return accountEventStatus;
	}

	public List<EventRound> getEventRounds() {
		return this.eventRounds;
	}

	public void setEventRounds(List<EventRound> eventRounds) {
		this.eventRounds = eventRounds;
	}

	public EventRound addEventRound(EventRound eventRound) {
		getEventRounds().add(eventRound);
		eventRound.setEvent(this);

		return eventRound;
	}

	public EventRound removeEventRound(EventRound eventRound) {
		getEventRounds().remove(eventRound);
		eventRound.setEvent(null);

		return eventRound;
	}

}