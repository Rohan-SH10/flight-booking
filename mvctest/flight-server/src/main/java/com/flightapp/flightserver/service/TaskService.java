package com.flightapp.flightserver.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
   private List<String> tasks = new ArrayList<>();

   public String addTask(String taskName){
       tasks.add(taskName);
       return "Success";
   }

   public List<String> fetchTasks(){
    return tasks;
   }


}
