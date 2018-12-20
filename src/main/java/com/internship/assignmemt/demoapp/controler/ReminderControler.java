package com.internship.assignmemt.demoapp.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.internship.assignmemt.demoapp.model.Reminder;
import com.internship.assignmemt.demoapp.repo.ReminderRepo;

@RestController
public class ReminderControler {

	@Autowired
	private ReminderRepo repository;

	@RequestMapping(method = RequestMethod.POST, value = "/addRem", produces = MediaType.APPLICATION_JSON_VALUE)
	public Reminder addDetail(@RequestBody Reminder reminders) {
		return repository.save(reminders);
	}

	@RequestMapping(value = "/reminders", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reminder> gtAllDetail() {
		List<Reminder> reminders = new ArrayList<>();
		repository.findAll().forEach(reminders::add);
		return reminders;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/reminders/{eventId}", produces = MediaType.APPLICATION_XML_VALUE)
	public void updateReminder(@RequestBody Reminder reminders, @PathVariable Integer eventId) {
		Reminder savedRemider = repository.getOne(eventId);
		BeanUtils.copyProperties(reminders, savedRemider);
		repository.save(savedRemider);
	}

}
