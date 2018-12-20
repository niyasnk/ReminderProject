package com.internship.assignmemt.demoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internship.assignmemt.demoapp.model.Reminder;

public interface ReminderRepo extends JpaRepository<Reminder, Integer> {

}
