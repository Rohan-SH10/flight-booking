package com.flightapp.flightserver.repository;

import com.flightapp.flightserver.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,String> {
}
