package com.internship.assignmemt.demoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reminder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eventId;
	private String eventName;
	private String eventDate;
	private String eventTime;
	private String eventDesc;

	public String getEventName() {
		return eventName;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	@Override
	public String toString() {
		return "RemindersModel [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate
				+ ", eventTime=" + eventTime + ", eventDesc=" + eventDesc + "]";
	}

}
