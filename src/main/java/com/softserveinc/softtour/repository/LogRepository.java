package com.softserveinc.softtour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.softserveinc.softtour.entity.Logs;

public interface LogRepository extends JpaRepository<Logs, Long> {
	
	@Modifying
	@Query("DELETE FROM Logs l WHERE l.id = ?1")
	public void deleteWeekLogs(long id);

	
}
